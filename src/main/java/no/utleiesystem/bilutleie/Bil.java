package no.utleiesystem.bilutleie;

@Entity
public class Bil implements Serializable {

    @id
    private String regNummer; 

    private String merke; 

    private String farge; 

    private String modell;

    private boolean ledig; 

    private char utleiegruppe; 


    @ManyToOne
    private utleiekontor utleiekontor;


    public void setRegistreringsNr(String regNummer){
        this.regNummer = regNummer;
    }





    
}
