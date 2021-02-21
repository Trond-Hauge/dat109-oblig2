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

    public Utleiekontor(){

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

    public int getPostnummer() {
        return this.postnummer;
    }

    public void setPostnummer(int postnummer) {
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



}
