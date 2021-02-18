package no.utleiesystem.bilutleie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

//@SpringBootApplication
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = "no.utleiesystem.bilutleie.controller" )
public class BilutleieApplication {


	public static void main(String[] args) {
		SpringApplication.run(BilutleieApplication.class, args);
	}
}
