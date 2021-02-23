package no.utleiesystem.bilutleie.repositories;

import org.springframework.data.repository.CrudRepository;

import no.utleiesystem.bilutleie.entities.Utleie;

public interface UtleieRepository extends CrudRepository<Utleie, Long> {
    
}
