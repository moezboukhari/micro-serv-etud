package org.sid.microservetud;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity  
@AllArgsConstructor
@NoArgsConstructor
 
public class Etudiant {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	private String nom;
	private String prenom;
	private Date DateNaissance;
	

}
