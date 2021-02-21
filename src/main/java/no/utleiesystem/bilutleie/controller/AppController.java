package no.utleiesystem.bilutleie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import no.utleiesystem.bilutleie.entities.Kunde;

@Controller
public class AppController {
 
     //index bør ha med billeien å gjøre
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    //login
        //la eksisterende kunde logge inn

    // Registrering
    @GetMapping("/Registrering")
    public String visNyAnsatt(Model model){
        // bruker model for å binde form data
        Kunde kunde = new Kunde();
        model.addAttribute("kunde", kunde);
        return "ny_kunde";
    }
        //generering av kunde

    //Bekreftelse av form i index går videre til valg av tilgjengelige biler.

}