package no.utleiesystem.bilutleie.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class BilutleieController {
    
    @RequestMapping("/")
    public String index() {return "start";}
}
