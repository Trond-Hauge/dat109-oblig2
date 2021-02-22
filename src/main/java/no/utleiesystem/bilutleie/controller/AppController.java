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

    private Utleiekontor hentested;

    @GetMapping("/")
    public String getAlleUtleiekontor(ModelMap map){
        Utleie utleie = new Utleie();
        map.addAttribute("utleie", utleie);
        map.addAttribute("alleKontor", uService.hentAlleUtleiekontor());
        map.addAttribute("biler", bilService.hentBilerEtterUtleiekontor(hentested));
        return "index";
    }

    @PostMapping("/")
    public String getAlleUtleiekontor(@ModelAttribute("utleie") Utleie utleie){
        //For kontroll av hva som skjer under testing
        hentested = utleie.getHentested();
        return "redirect:/";
    }

    //login
        //la eksisterende kunde logge inn

        // Knapp som viser til Registrering i logg inn... Nødvendig?? 

    // Registrering
    @GetMapping("/Registrering")
    public String visNyAnsatt(Model model){
        // bruker model for å binde form data
        Kunde kunde = new Kunde();
        model.addAttribute("kunde", kunde);
        return "ny_kunde";
    }

    @PostMapping("/lagreKunde")
    public String lagreAnsatt(@ModelAttribute("kunde") Kunde kunde){
        // lagrer Ansatt til databasen 
        kundeService.saveKunde(kunde);
        // Må endres redirect, slik at den viser til nettsiden 
        return "redirect:/";
    }
        //generering av kunde

    //Bekreftelse av form i index går videre til valg av tilgjengelige biler.

}