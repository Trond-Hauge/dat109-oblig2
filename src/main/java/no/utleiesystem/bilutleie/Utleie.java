package no.utleiesystem.bilutleie;

import java.io.Serializable;
import java.security.Timestamp;
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
		@ManyToOne
		private Bil bil;
		
		//many-to-one forbindelse til kunde
		@ManyToOne
		private Kunde kunde;
		
		//many-to-one forbindelse til utleiekontor
		@ManyToOne
		private Utleiekontor utleiekontor;
	
		
		public Utleie() {
			
		}

		public int getUtleieID() {
			return utleieID;
		}

		public void setUtleieID(int utleieID) {
			this.utleieID = utleieID;
		}

		public Timestamp getTidUtleie() {
			return tidUtleie;
		}

		public void setTidUtleie(Timestamp tidUtleie) {
			this.tidUtleie = tidUtleie;
		}

		public Timestamp getTidRetur() {
			return tidRetur;
		}

		public void setTidRetur(Timestamp tidRetur) {
			this.tidRetur = tidRetur;
		}

		public int getKmUtleie() {
			return kmUtleie;
		}

		public void setKmUtleie(int kmUtleie) {
			this.kmUtleie = kmUtleie;
		}

		public int getKmRetur() {
			return kmRetur;
		}

		public void setKmRetur(int kmRetur) {
			this.kmRetur = kmRetur;
		}

		public Bil getBil() {
			return bil;
		}

		public void setBil(Bil bil) {
			this.bil = bil;
		}

		public Kunde getKunde() {
			return kunde;
		}

		public void setKunde(Kunde kunde) {
			this.kunde = kunde;
		}

		public Utleiekontor getUtleiekontor() {
			return utleiekontor;
		}

		public void setUtleiekontor(Utleiekontor utleiekontor) {
			this.utleiekontor = utleiekontor;
		}

		@Override
		public String toString() {
			return null; //Må finne ut hva som skal skrives ut!!!
		}
}
