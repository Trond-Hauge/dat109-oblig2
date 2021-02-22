package no.utleiesystem.bilutleie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.utleiesystem.bilutleie.entities.Utleie;
import no.utleiesystem.bilutleie.repositories.UtleieRepository;

@Service
public class UtleieService {

    @Autowired
    private UtleieRepository utleieRepo;

    public Utleie saveUtleie(Utleie utleie){
        return utleieRepo.save(utleie);
    }

    
}
