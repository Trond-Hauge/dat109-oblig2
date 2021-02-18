package no.utleiesystem.bilutleie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
 
     
    @RequestMapping("/Registrering")
    public String viewPage() {
        return "index";
    }
}