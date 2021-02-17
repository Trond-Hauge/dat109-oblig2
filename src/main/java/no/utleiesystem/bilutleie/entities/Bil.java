package no.utleiesystem.bilutleie.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Bil implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String regNummer;
    private String merke;
    private String modell;
    private String farge;
    private boolean ledig = false;
    private char utleiegruppe;
    private int kilometerstand;

    @ManyToOne
    private Utleiekontor utleiekontor;

    //Notat: Merke og utleiegruppe kan vurderes å gjøres til ENUM

    /**
     * Konstruktør for klassen Bil.
     * 
     * @param regNummer - registreringsnummeret til bilen.
     * @param merke - merket til bilen.
     * @param modell - modellen til bilen.
     * @param farge - fargen til bilen.
     * @param utleiegruppe - utleiegruppen bilen tilhører.
     */
    public Bil(String regNummer, String merke, String modell, String farge, char utleiegruppe, int kilometerstand){
        this.regNummer = regNummer;
        this.merke = merke;
        this.modell = modell;
        this.farge = farge;
        this.utleiegruppe = utleiegruppe;
        this.kilometerstand = kilometerstand;
    }

    public String getRegNummer() {
        return this.regNummer;
    }

    public void setRegNummer(String regNummer) {
        this.regNummer = regNummer;
    }

    public String getMerke() {
        return this.merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModell() {
        return this.modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getFarge() {
        return this.farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public boolean isLedig() {
        return this.ledig;
    }

    public boolean getLedig() {
        return this.ledig;
    }

    public void setLedig(boolean ledig) {
        this.ledig = ledig;
    }

    public char getUtleiegruppe() {
        return this.utleiegruppe;
    }

    public void setUtleiegruppe(char utleiegruppe) {
        this.utleiegruppe = utleiegruppe;
    }

    public Utleiekontor getUtleiekontor() {
        return this.utleiekontor;
    }

    public void setUtleiekontor(Utleiekontor utleiekontor) {
        this.utleiekontor = utleiekontor;
    }

    public int getKilometerstand() {
        return this.kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    
}
