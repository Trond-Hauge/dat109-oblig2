package no.utleiesystem.bilutleie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import no.utleiesystem.bilutleie.entities.Kunde;
import no.utleiesystem.bilutleie.repositories.KundeRepository;

@Service
public class KundeServiceImpl implements KundeService {

    @Autowired
	private KundeRepository kundeRepository;

    @Override
    public void saveKunde(Kunde kunde) {
    this.kundeRepository.save(kunde);

    }
    
}
