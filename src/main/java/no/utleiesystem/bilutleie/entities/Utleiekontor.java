package no.utleiesystem.bilutleie.entities;

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

    //@OneToMany
    //@JoinColumn(name = "regNummer")
    //private Bil bil;

    /**
     * Konstruktør for klassen Utleiekontor.
     * 
     * @param gateadresse
     * @param postnummer
     * @param poststed
     * @param tlf
     */
    public Utleiekontor(String gateadresse, String postnummer, String poststed, int tlf){
        this.gateadresse = gateadresse;
        this.postnummer = postnummer;
        this.poststed = poststed;
        this.tlf = tlf;
    }


}
