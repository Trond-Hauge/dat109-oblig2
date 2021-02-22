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
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AppController {

    @Autowired
    private KundeService kundeService;
    @Autowired
    private UtleiekontorService uService;
    @Autowired
    private BilService bilService;

    private Utleiekontor hentested;
    public Utleie utleie;

    
    @RequestMapping("/")
    public String getAlleUtleiekontor(ModelMap map, Utleie utleie){
        map.addAttribute("utleie", new Utleie());
        map.addAttribute("alleKontor", uService.hentAlleUtleiekontor());
        map.addAttribute("biler", bilService.hentBilerEtterUtleiekontor(hentested));
        return "index";
    }

    @PostMapping("/")
    public String getAlleUtleiekontor(@ModelAttribute("utleie") Utleie utleie){
        hentested = utleie.getHentested();
        System.out.println(utleie);

        return "redirect:/";
    }

    @GetMapping("/registrer")
    public String genererKunde(Model model){
        // bruker model for å binde form data
        Kunde kunde = new Kunde();
        model.addAttribute("kunde", kunde);
        return "registrer";
    }

    @PostMapping("/lagre-kunde")
    public String genererKunde(@ModelAttribute("kunde") Kunde kunde){
        // lagrer Ansatt til databasen 
        try {
            kundeService.saveKunde(kunde);
            //utleie.setKunde(kunde);
        } catch (Exception e) {
            return "redirect:/registrer";
        }
        // Må endres redirect, slik at den viser til nettsiden 
        return "redirect:/kvittering";
    }

    @GetMapping(value="/kvittering")
    public String visKvittering() {
        return "kvittering";
    }
    
    
    }

   
    
        
