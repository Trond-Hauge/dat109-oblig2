package no.utleiesystem.bilutleie;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import no.utleiesystem.bilutleie.entities.Kunde;
import no.utleiesystem.bilutleie.repositories.KundeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class KundeRepositoryTest {

    @Autowired
    private KundeRepository kunrep;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        Kunde kunde = new Kunde();
        kunde.setTlf(92010984);
        kunde.setFornavn("Kåre");
        kunde.setEtternavn("Monsen");
    

       Kunde savedUser = kunrep.save(kunde);

       Kunde exitUser = entityManager.find(Kunde.class, savedUser.getId());

       assertThat(exitUser.getFornavn()).isEqualTo(kunde.getFornavn());
       
    }


     
       }
    

    

