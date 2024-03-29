package no.utleiesystem.bilutleie.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Utleiekontor implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="nummer", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nummer;
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

    @Override
    public String toString(){
        return poststed;
    }

    public Long getNummer() {
        return this.nummer;
    }

    public void setNummer(Long nummer) {
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
