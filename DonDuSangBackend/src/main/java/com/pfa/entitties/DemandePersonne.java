package com.pfa.entitties;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class DemandePersonne {
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String sexe;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	
	public DemandePersonne(String nom, String prenom, String email,
			String telephone, String sexe, String description, Date dateDebut,
			Date dateFin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.sexe = sexe;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	
	
}
