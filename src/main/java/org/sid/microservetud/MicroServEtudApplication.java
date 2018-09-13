package org.sid.microservetud;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServEtudApplication implements Runnable{
@Autowired
private EtudiantRepository etudiantRepository;
	public static void main(String[] args) {
		SpringApplication.run(MicroServEtudApplication.class, args);
	}

	@Override
	public void run() {
		 etudiantRepository.save(new Etudiant(null,"boukhari","moez",new Date()));
		 etudiantRepository.save(new Etudiant(null,"boukhari222","moez222",new Date()));

	}
	
}
