package com.pfa.entitties;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
@Setter
@Getter
@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class AnalyseResponse {
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String sexe;
	//private TypeSang typeSang;
	
	private Date dateResponse;
	private Date dateDon;
	private String description;
	public AnalyseResponse(String nom, String prenom, String email,
			String telephone, String sexe, Date dateResponse, Date dateDon,
			String description) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.sexe = sexe;
		this.dateResponse = dateResponse;
		this.dateDon = dateDon;
		this.description = description;
	}
	
	

}
