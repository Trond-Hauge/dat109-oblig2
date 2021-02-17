package no.utleiesystem.bilutleie.repositories;

import org.springframework.data.repository.CrudRepository;

import no.utleiesystem.bilutleie.entities.Bil;

public interface BilRepo extends CrudRepository<Bil, String> {
    
}
