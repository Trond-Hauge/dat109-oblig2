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
    public Utleie utleie;

    
    @RequestMapping("/")
    public String getAlleUtleiekontor(ModelMap map){
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
        
        //utleie.setKunde(kunde);
        // lagrer Ansatt til databasen 
        kundeService.saveKunde(kunde);
        // Må endres redirect, slik at den viser til nettsiden 
        return "kvittering";

    }
    
    }

   
    
        
