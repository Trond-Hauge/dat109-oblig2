package no.utleiesystem.bilutleie;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kunde implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		private String tlf;
		private String fornavn;
		private String etternavn;
		private String kredittkort;
		
		
		@ManyToOne
		private List<Utleie> utleie;
		
		
		public Kunde() {
			
		}
		
		public Kunde(String tlf, String fornavn, String etternavn, String kredittkort) {
			this.tlf = tlf;
			this.fornavn = fornavn;
			this.etternavn = etternavn;
			this.kredittkort = kredittkort;
		}
		
		public String getFornavn() {
			return fornavn;
		}

		public void setFornavn(String fornavn) {
			this.fornavn = fornavn;
		}

		public String getEtternavn() {
			return etternavn;
		}

		public void setEtternavn(String etternavn) {
			this.etternavn = etternavn;
		}

		public String getKredittkort() {
			return kredittkort;
		}

		public void setKredittkort(String kredittkort) {
			this.kredittkort = kredittkort;
		}

		public List<Utleie> getUtleie() {
			return utleie;
		}

		public void setUtleie(List<Utleie> utleie) {
			this.utleie = utleie;
		}

		public String getTlf() {
			return this.tlf;
		}
		
		public void setTlf(String tlf) {
			this.tlf = tlf;
		}
		
}
