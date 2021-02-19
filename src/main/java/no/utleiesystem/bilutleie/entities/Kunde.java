package no.utleiesystem.bilutleie.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kunde implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String tlf;
		private String fornavn;
		private String etternavn;
		private String kredittkort;
		
		
		//@ManyToOne
		//private List<Utleie> utleie;
		
		
		public Kunde() {
			
		}
		
		public Kunde(String tlf, String fornavn, String etternavn, String kredittkort) {
			this.tlf = tlf;
			this.fornavn = fornavn;
			this.etternavn = etternavn;
			this.kredittkort = kredittkort;
		}
}