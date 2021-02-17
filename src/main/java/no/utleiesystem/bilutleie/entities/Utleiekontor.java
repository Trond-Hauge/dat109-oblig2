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

    @OneToMany
    private Bil bil;

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

    public int getNummer() {
        return this.nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getGateadresse() {
        return this.gateadresse;
    }

    public void setGateadresse(String gateadresse) {
        this.gateadresse = gateadresse;
    }

    public String getPostnummer() {
        return this.postnummer;
    }

    public void setPostnummer(String postnummer) {
        this.postnummer = postnummer;
    }

    public String getPoststed() {
        return this.poststed;
    }

    public void setPoststed(String poststed) {
        this.poststed = poststed;
    }

    public int getTlf() {
        return this.tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public Bil getBil() {
        return this.bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }


}
