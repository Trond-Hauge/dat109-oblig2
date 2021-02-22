package no.utleiesystem.bilutleie.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="kunde")
@Entity
public class Kunde implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id; 
		private int tlf;
		private String fornavn;
		private String etternavn;
		private int kredittkort;
		
		public Kunde() {
			
		}
		
		public Kunde(long id, int tlf, String fornavn, String etternavn, int kredittkort) {
			this.id = id; 
			this.tlf = tlf;
			this.fornavn = fornavn;
			this.etternavn = etternavn;
			this.kredittkort = kredittkort;
		}


	public int getTlf() {
		return this.tlf;
	}

	public void setTlf(int i) {
		this.tlf = i;
	}

	public String getFornavn() {
		return this.fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return this.etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public int getKredittkort() {
		return this.kredittkort;
	}

	public void setKredittkort(int kredittkort) {
		this.kredittkort = kredittkort;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

}