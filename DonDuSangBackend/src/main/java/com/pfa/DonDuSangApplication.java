package com.pfa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.pfa.entitties.Infirmier;
import com.pfa.entitties.Personne;

@SpringBootApplication
public class DonDuSangApplication implements CommandLineRunner{
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
;

	public static void main(String[] args) {
		SpringApplication.run(DonDuSangApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Personne.class);
		repositoryRestConfiguration.exposeIdsFor(Infirmier.class);
		
	}

}
