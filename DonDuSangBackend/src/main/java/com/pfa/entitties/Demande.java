package com.pfa.entitties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEMANDE")
public class Demande implements Serializable {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ID_DEMANDE")	
		private Long id ;
		private String description;
		private Date dateDebut;
		private Date dateFin;
		
		@OneToMany(mappedBy = "demande")
		List<Response> responses;
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="PERSONNE_ID")
		private Personne personne;
		
		public Demande() {
			super();
		}
		
		
		public Demande(String description, Date dateDebut, Date dateFin,
				List<Response> responses, Personne personne) {
			super();
			this.description = description;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.responses = responses;
			this.personne = personne;
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		

		public Date getDateDebut() {
			return dateDebut;
		}


		public void setDateDebut(Date dateDebut) {
			this.dateDebut = dateDebut;
		}


		public Date getDateFin() {
			return dateFin;
		}


		public void setDateFin(Date dateFin) {
			this.dateFin = dateFin;
		}


		public Personne getPersonne() {
			return personne;
		}


		public void setPersonne(Personne personne) {
			this.personne = personne;
		}


		public List<Response> getResponses() {
			return responses;
		}
		public void setResponses(List<Response> responses) {
			this.responses = responses;
		}


		@Override
		public String toString() {
			return "Demande [id=" + id + ", description=" + description
					+ ", date_debut=" + dateDebut + ", date_fin=" + dateFin
					+ ", responses=" + responses + ", personne=" + personne
					+ "]";
		}
		
		
}

