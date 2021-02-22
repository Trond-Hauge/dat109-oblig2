package no.utleiesystem.bilutleie.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Kunde implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		private String tlf;
		private String fornavn;
		private String etternavn;
		private int kredittkort;

	
		
		public Kunde() {
			
		}
		
		public Kunde(String tlf, String fornavn, String etternavn, int kredittkort) {
		
			this.tlf = tlf;
			this.fornavn = fornavn;
			this.etternavn = etternavn;
			this.kredittkort = kredittkort;
		}


	public String getTlf() {
		return this.tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
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
		@Override
		public String toString() {
		return "{" +
			" tlf='" + getTlf() + "'" +
			", fornavn='" + getFornavn() + "'" +
			", etternavn='" + getEtternavn() + "'" +
			", kredittkort='" + getKredittkort() + "'" +
			"}";
	}
	}

