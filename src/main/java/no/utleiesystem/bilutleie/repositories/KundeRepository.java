package no.utleiesystem.bilutleie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import no.utleiesystem.bilutleie.entities.Kunde;

@Repository
public interface KundeRepository extends JpaRepository <Kunde,Long> {
    
}
