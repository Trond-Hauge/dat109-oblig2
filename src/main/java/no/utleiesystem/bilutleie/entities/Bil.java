package no.utleiesystem.bilutleie.entities;

import javax.persistence.*;


@Entity
@Table(schema = "bilutleie", name = "bil")
public class Bil {

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

    
}
