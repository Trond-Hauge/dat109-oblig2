package no.utleiesystem.bilutleie;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Adresse")
@Table(name = "Adresse", schema = "oblig2")

public class Adresse implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		private String gateadresse;
		private int postnr;
		private String poststed;
		
		
		@OneToMany(mappedBy = "adresse")
		private List<Kunde> kunde;
		
		
		@OneToMany(mappedBy = "adresse")
		private List<Utleiekontor> utleiekontor;
		
		public Adresse() {
			
		}
		
		public Adresse(String gateadresse, int postnr, String poststed) {
			this.gateadresse = gateadresse;
			this.postnr = postnr;
			this.poststed = poststed;
		}

}
