package no.utleiesystem.bilutleie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utleiekontor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int nummer;
    
}
