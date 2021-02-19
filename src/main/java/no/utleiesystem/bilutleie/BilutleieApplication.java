package no.utleiesystem.bilutleie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BilutleieApplication implements CommandLineRunner {

	//trengs det?
	@Autowired
	private JdbcTemplate jdbcT;

	//trengs det?
	@Override
	public void run(String ... args) throws Exception{
	}

	public static void main(String[] args) {
		SpringApplication.run(BilutleieApplication.class, args);
	}
}
