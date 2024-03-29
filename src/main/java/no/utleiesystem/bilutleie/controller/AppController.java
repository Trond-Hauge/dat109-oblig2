package no.utleiesystem.bilutleie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import no.utleiesystem.bilutleie.entities.*;
import no.utleiesystem.bilutleie.services.*;

@Controller
public class AppController {

    @Autowired
    private KundeService kundeService;
    @Autowired
    private UtleiekontorService uService;
    @Autowired
    private BilService bilService;
    @Autowired
    private UtleieService utleieService;

    private Utleiekontor hentested;
    private Utleie utleie = new Utleie();
    
    @RequestMapping("/")
    public String getAlleUtleiekontor(ModelMap map){
        map.addAttribute("utleie", this.utleie);
        map.addAttribute("alleKontor", uService.hentAlleUtleiekontor());
        return "index";
    }

    @PostMapping("/")
    public String getAlleUtleiekontor(@ModelAttribute("utleie") Utleie utleie){
        this.utleie = utleie;
        this.hentested = utleie.getHentested();
        System.out.println("POST: \n" + utleie);

        if(this.utleie.validatePartOne()){
            return "redirect:/velg-bil";
        }
        return "redirect:/";
    }

    //Skulle gjerne gjort dette mer dynamisk enn å redirect'e til ulike templates, men det tok tid å lære Spring.

    @GetMapping("velg-bil")
    public String getVelgBil(ModelMap map){
        map.addAttribute("utleie", new Utleie());
        map.addAttribute("biler", bilService.hentBilerEtterUtleiekontor(this.hentested));
        return "velg-bil";
    }

    @PostMapping("velg-bil")
    public String getVelgBil(@ModelAttribute("utleie") Utleie utleie){
        //kobler objekt redigert av form med objektet det arbeides på
        this.utleie.setBil(utleie.getBil());
        this.utleie.oppdaterPris();

        //for å kontrollere at utforming går riktig for seg
        System.out.println("POST: \n" + this.utleie);
        return "redirect:/registrer";
    }

    @GetMapping("/registrer")
    public String genererKunde(Model model){
        // bruker model for å binde form data
        model.addAttribute("kunde", new Kunde());
        return "registrer";
    }

    @PostMapping("/lagre-kunde")
    public String genererKunde(@ModelAttribute("kunde") Kunde kunde){
        // lagrer Ansatt til databasen 
        try {
            kundeService.saveKunde(kunde);
            utleie.setKunde(kunde);
        } catch (Exception e) {
            return "redirect:/registrer";
        }
        utleie.getBil().setLedig(false);

        try {
            utleieService.saveUtleie(this.utleie);
        } catch (Exception e) {
            System.out.println("Utleie ble ikke lagret.");
        }

        return "redirect:/kvittering";
    }

    @GetMapping(value="/kvittering")
    public String visKvittering(Model model) {
        model.addAttribute("utleie", this.utleie);
        return "kvittering";
    }
        
}