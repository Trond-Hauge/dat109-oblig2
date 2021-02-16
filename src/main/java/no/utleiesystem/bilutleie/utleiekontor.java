package no.utleiesystem.bilutleie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class utleiekontor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int nummer;
    String adresse;
    int tlf;

    public utleiekontor(String adresse, int tlf){
        this.adresse = adresse;
        this.tlf = tlf;
    }
    
}
