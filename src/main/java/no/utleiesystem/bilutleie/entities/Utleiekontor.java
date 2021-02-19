package no.utleiesystem.bilutleie.entities;

import javax.persistence.*;

@Entity
public class Utleiekontor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nummer;
    private String gateadresse;
    private int postnummer; //kan vurderes å gjøres til String
    private String poststed;
    private int tlf;

    /**
     * Konstruktør for klassen Utleiekontor.
     * 
     * @param gateadresse
     * @param postnummer
     * @param poststed
     * @param tlf
     */
    public Utleiekontor(String gateadresse, int postnummer, String poststed, int tlf){
        this.gateadresse = gateadresse;
        this.postnummer = postnummer;
        this.poststed = poststed;
        this.tlf = tlf;
    }


}
