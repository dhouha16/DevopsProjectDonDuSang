package com.pfa.entitties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="RESPONSE")
public class Response implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)  
    @JoinColumn(name = "personne_id")
	private Personne personne;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "demande_id")
	private Demande demande;
	 
	private Date dateResponse;
	private Date dateDon;
	

	
	public Response() {
		super();
	}
	public Response( Personne personne, Demande demande,
			Date dateResponse, Date dateDon) {
		super();
		
		this.personne = personne;
		this.demande = demande;
		this.dateResponse = dateResponse;
		this.dateDon = dateDon;
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Demande getDemande() {
		return demande;
	}
	public void setDemande(Demande demande) {
		this.demande = demande;
	}
	public Date getDateResponse() {
		return dateResponse;
	}
	public void setDateResponse(Date dateResponse) {
		this.dateResponse = dateResponse;
	}
	public Date getDateDon() {
		return dateDon;
	}
	public void setDateDon(Date dateDon) {
		this.dateDon = dateDon;
	}
	@Override
	public String toString() {
		return "Response [id=" + id + ", personne=" + personne + ", demande="
				+ demande + ", dateResponse=" + dateResponse + ", dateDon="
				+ dateDon +"]";
	}
	

}
