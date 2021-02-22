package no.utleiesystem.bilutleie.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.utleiesystem.bilutleie.repositories.BilRepo;
import no.utleiesystem.bilutleie.entities.Bil;
import no.utleiesystem.bilutleie.entities.Utleiekontor;

@Service
public class BilService {

    @Autowired
    private BilRepo bilRepo;

    public List<Bil> hentAlleBiler(){
        List<Bil> liste = new ArrayList<>();
        bilRepo.findAll().forEach(liste::add);
        return liste;
    }

    public List<Bil> hentBilerEtterUtleiekontor(Utleiekontor utleiekontor){
        List<Bil> liste = new ArrayList<>();
        bilRepo.findAllByUtleiekontor(utleiekontor).forEach(liste::add);
        return liste;
    }

    /*
    public Bil hentBil(String regNummer){
        // legg til en null-fanger. if-greie med ? har vært brukt av lærer før.
        return bilRepo.findById(regNummer);
    }*/
    
    // lag flere av denne metoden, med samme navn, bare med ulike parametere
    //public List<Bil> finnBiler(char utleiegruppe) {
    //    return bilRepo.finnBilerEtterGruppe(utleiegruppe);
    //}

}
