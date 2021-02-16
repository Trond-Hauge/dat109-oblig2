package no.utleiesystem.bilutleie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Bil implements Serializable {

    @Id
    private String regNummer; 

    private String merke; 

    private String farge; 

    private String modell;

    private boolean ledig; 

    private char utleiegruppe;


    @ManyToOne
    private Utleiekontor utleiekontor;


    public void setRegistreringsNr(String regNummer){
        this.regNummer = regNummer;
    }





    
}
