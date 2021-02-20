package no.utleiesystem.bilutleie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
 
     //index bør ha med billeien å gjøre
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    //login
        //la eksisterende kunde logge inn

    //registrering
        //generering av kunde

    //Bekreftelse av form i index går videre til valg av tilgjengelige biler.

}