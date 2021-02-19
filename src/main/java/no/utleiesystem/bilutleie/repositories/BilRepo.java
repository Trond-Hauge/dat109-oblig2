package no.utleiesystem.bilutleie.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


import no.utleiesystem.bilutleie.entities.Bil;

public interface BilRepo extends CrudRepository<Bil, String> {

    //@Query("SELECT * FROM Bil b WHERE b.utleiegruppe = ?1" )
    //List<Bil> finnBilerEtterGruppe(char utleiegruppe);
    
    // for å lage en query med filtere, må det lages en finnBiler(String queryString) som tar inn en generert querysnipp.
    // kan være nyttig dersom nettsiden bruker filtersøk
    //konsept
    //@Query("SELECT * FROM Bil b ?1")
    //List<Bil> finnDynamisk(String query);
}
