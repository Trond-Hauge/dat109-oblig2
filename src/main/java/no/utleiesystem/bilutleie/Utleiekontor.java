package no.utleiesystem.bilutleie;

import javax.persistence.*;

@Entity
public class Utleiekontor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nummer;
    private String gateadresse;
    private String postnummer;
    private String poststed;
    private int tlf;

    public Utleiekontor(String gateadresse, String postnummer, String poststed, int tlf){
        this.gateadresse = gateadresse;
        this.postnummer = postnummer;
        this.poststed = poststed;
        this.tlf = tlf;
    }

    @OneToMany
    private Bil bil;


    
}
