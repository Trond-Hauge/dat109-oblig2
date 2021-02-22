package no.utleiesystem.bilutleie.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Utleie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int utleieID;
	private String tidUtleie;
	private int antallDager;
	private int pris;
	private int kmUtleie;
	private int kmRetur;

	@ManyToOne
	private Bil bil;
	@ManyToOne
	private Utleiekontor hentested;
	@ManyToOne
	private Utleiekontor retursted;
	@ManyToOne
	private Kunde kunde;

	public Utleie() {

	}

	public boolean validatePartOne(){
		if (hentested != null && retursted != null && tidUtleie != null && antallDager != 0){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Utleie #" + utleieID +
		"\nHentedato: " + tidUtleie +
		"\nAntall leiedager : " + antallDager +
		"\nBil: " + bil +
		"\nHentested: " + hentested +
		"\nRetursted: " + retursted +
		"\nKunde: " + kunde +
		"\nTotalpris: " + pris;
	}

	public int getUtleieID() {
		return this.utleieID;
	}

	public void setUtleieID(int utleieID) {
		this.utleieID = utleieID;
	}

	public String getTidUtleie() {
		return this.tidUtleie;
	}

	public void setTidUtleie(String tidUtleie) {
		this.tidUtleie = tidUtleie;
	}


	public int getAntallDager() {
		return this.antallDager;
	}

	public void setAntallDager(int antallDager) {
		this.antallDager = antallDager;
	}


	public int getPris() {
		return this.pris;
	}

	public void setPris(int pris) {
		this.pris = pris;
	}

	public Kunde getKunde() {
		return this.kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}


	public int getKmUtleie() {
		return this.kmUtleie;
	}

	public void setKmUtleie(int kmUtleie) {
		this.kmUtleie = kmUtleie;
	}

	public int getKmRetur() {
		return this.kmRetur;
	}

	public void setKmRetur(int kmRetur) {
		this.kmRetur = kmRetur;
	}

	public Bil getBil() {
		return this.bil;
	}

	public void setBil(Bil bil) {
		this.bil = bil;
	}

	public Utleiekontor getHentested() {
		return this.hentested;
	}

	public void setHentested(Utleiekontor hentested) {
		this.hentested = hentested;
	}

	public Utleiekontor getRetursted() {
		return this.retursted;
	}

	public void setRetursted(Utleiekontor retursted) {
		this.retursted = retursted;
	}

}
