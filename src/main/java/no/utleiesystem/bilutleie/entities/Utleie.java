package no.utleiesystem.bilutleie.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;

@Entity
public class Utleie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int utleieID;
	private Timestamp tidUtleie;
	private Timestamp tidRetur;
	private int kmUtleie;
	private int kmRetur;

	@ManyToOne
	private Bil bil;

	@ManyToOne
	private Utleiekontor hentested;

	@ManyToOne
	private Utleiekontor retursted;

	// @ManyToOne
	// private Kunde kunde;

	public Utleie() {

	}

	@Override
	public String toString() {
		return "Utleie #" + utleieID +
		"\nHentedato: " + tidUtleie +
		"\nReturdato: " + tidRetur +
		"\nBil: " + bil +
		"\nHentested: " + hentested +
		"\nRetursted: " + retursted;
	}

	public int getUtleieID() {
		return this.utleieID;
	}

	public void setUtleieID(int utleieID) {
		this.utleieID = utleieID;
	}

	public Timestamp getTidUtleie() {
		return this.tidUtleie;
	}

	public void setTidUtleie(Timestamp tidUtleie) {
		this.tidUtleie = tidUtleie;
	}

	public Timestamp getTidRetur() {
		return this.tidRetur;
	}

	public void setTidRetur(Timestamp tidRetur) {
		this.tidRetur = tidRetur;
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
