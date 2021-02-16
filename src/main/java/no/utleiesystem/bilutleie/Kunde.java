package no.utleiesystem.bilutleie;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Kunde")
@Table(name = "Kunde", schema = "oblig2")

public class Kunde implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		private String tlf;
		private String fornavn;
		private String etternavn;
		private String kredittkort;
		
		@ManyToOne
		@JoinColumn(name = "adresse")
		private Adresse adresse;
		
		@OneToMany(mappedBy = "utleie")
		private List<Utleie> utleie;
		
		
		public Kunde() {
			
		}
		
		public Kunde(String tlf, String fornavn, String etternavn, Adresse adresse, String kredittkort) {
			this.tlf = tlf;
			this.fornavn = fornavn;
			this.etternavn = etternavn;
			this.adresse = adresse;
			this.kredittkort = kredittkort;
		}
		
		public String getTlf() {
			return this.tlf;
		}
		
		public void setTlf(String tlf) {
			this.tlf = tlf;
		}
    
}
