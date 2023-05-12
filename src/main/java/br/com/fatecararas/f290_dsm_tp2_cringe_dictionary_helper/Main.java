package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.services.PalavraService;

@SpringBootApplication
public class Main implements CommandLineRunner{

	@Autowired
	private PalavraService service;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
