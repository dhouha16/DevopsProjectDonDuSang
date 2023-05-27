package com.pfa.entitties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="PERSONNE")
public class Personne implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_PERSONNE")	
	private Long id;
	
	@Column(name="CIN_DONNEUR")
		private int cin;
	@Column(name = "NOM")
		private String nom;
	
	@Column(name = "PRENOM")
		private String prenom;
	
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="DATE_TIME")
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date dateNaissance;
		@Column(name = "GROUP_DON")
		@Enumerated(EnumType.ORDINAL)
		private TypeSang typeSang;
		@Column(name = "EMAIL")
		private String email;
		@Column(name = "PASSWORD")
		private String password;
		@Column(name = "TELEPHONE")
		private String telephone;
		
		@Column(name = "sexe")
		private String sexe;
		
		
		public Personne() {
			super();
		}
		
		public Personne(int cin, String nom, String prenom,
				Date dateNaissance, TypeSang typeSang, String email,
				String password, String telephone, String sexe
				) {
			super();
			this.cin = cin;
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.typeSang = typeSang;
			this.email = email;
			this.password = password;
			this.telephone = telephone;
			this.sexe = sexe;
			
		}
		public int getCin() {
			return cin;
		}
		public void setCin(int cin) {
			this.cin = cin;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public Date getDateNaissance() {
			return dateNaissance;
		}
		public void setDate_naissance(Date dateNaissance) {
			this.dateNaissance = dateNaissance;
		}
		public TypeSang getTypeSang() {
			return typeSang;
		}
		public void setTypeSang(TypeSang typeSang) {
			this.typeSang = typeSang;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Personne [id=" + id + ", cin=" + cin + ", nom=" + nom
					+ ", prenom=" + prenom + ", date_naissance="
					+ dateNaissance + ", typeSang=" + typeSang + ", email="
					+ email + ", password=" + password + ", telephone="
					+ telephone + ", sexe=" + sexe 
					+"]";
		}
		
		
		
		
}
		
		
		