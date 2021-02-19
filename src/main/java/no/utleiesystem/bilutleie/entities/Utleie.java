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
		
		
		//many-to-one forbindelse til bil
		//@ManyToOne
		//private Bil bil;
		
		//many-to-one forbindelse til kunde
		//@ManyToOne
		//private Kunde kunde;
		
		//many-to-one forbindelse til utleiekontor
		//@ManyToOne
		//private Utleiekontor utleiekontor;
	
		
		public Utleie() {
			
		}

		@Override
		public String toString() {
			return null; //Må finne ut hva som skal skrives ut!!!
		}
}
