package no.utleiesystem.bilutleie.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import no.utleiesystem.bilutleie.repositories.BilRepo;
import no.utleiesystem.bilutleie.entities.Bil;

@Service
public class BilRepoService {
    
    @Autowired
    private BilRepo bilRepo;

    public List<Bil> hentAlleBiler(){
        List<Bil> liste = new ArrayList<>();
        bilRepo.findAll().forEach(liste::add);
        return liste;
    }

    /*
    public Bil hentBil(String regNummer){
        // legg til en null-fanger. if-greie med ? har vært brukt av lærer før.
        return bilRepo.findById(regNummer);
    }*/

    /*
    public List<Bil> finnBiler(char utleiegruppe) {
        @Query("SELECT * FROM Bil b WHERE b.utleiegruppe = :grp" )
        List<Bil> liste(utleiegruppe);

        return liste;
    }*/

}