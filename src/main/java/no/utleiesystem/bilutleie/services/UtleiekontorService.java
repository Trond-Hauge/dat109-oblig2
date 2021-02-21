package no.utleiesystem.bilutleie.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.utleiesystem.bilutleie.entities.Utleiekontor;
import no.utleiesystem.bilutleie.repositories.UtleiekontorRepository;

@Service
public class UtleiekontorService {
    
    @Autowired
    private UtleiekontorRepository uRepo;

    public List<Utleiekontor> hentAlleUtleiekontor(){
        List<Utleiekontor> liste = new ArrayList<>();
        uRepo.findAll().forEach(liste::add);
        return liste;
    }
}
