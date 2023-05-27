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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="INFIRMIER")
public class Infirmier implements Serializable {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ID_INFIRMIER")	
		private Long id;
		
		@Column(name = "CIN")
		private int cin;
		@Column(name = "NOM")
		private String nom;
	
		@Column(name = "PRENOM")
		private String prenom;
	
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="DATE_TIME")
		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date date_naissance;
		@Column(name = "GROUP_DON")
		private String group_don;
		@Column(name = "EMAIL")
		private String email;
		@Column(name = "PASSWORD")
		private String password;
		@Column(name = "TELPHONE")
		private String telephone;
		@Column(name = "DIPLOME")
		private String diplome;
		@Column(name = "sexe")
		private String sexe;
		@OneToMany(mappedBy = "infirmier", fetch = FetchType.LAZY)
		private List<Don> don;
		
		
		public Infirmier() {
			super();
		}
		public Infirmier(int cin, String nom, String prenom,
				Date date_naissance, String group_don, String email,
				String password, String telephone, String diplome, String sexe
				) {
			super();
			this.cin = cin;
			this.nom = nom;
			this.prenom = prenom;
			this.date_naissance = date_naissance;
			this.group_don = group_don;
			this.email = email;
			this.password = password;
			this.telephone = telephone;
			this.diplome = diplome;
			this.sexe = sexe;
			this.don=don;
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
		public Date getDate_naissance() {
			return date_naissance;
		}
		public void setDate_naissance(Date date_naissance) {
			this.date_naissance = date_naissance;
		}
		public String getGroup_don() {
			return group_don;
		}
		public void setGroup_don(String group_don) {
			this.group_don = group_don;
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
		public String getDiplome() {
			return diplome;
		}
		public void setDiplome(String diplome) {
			this.diplome = diplome;
		}
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
		
		
		public List<Don> getDon() {
			return don;
		}
		public void setDon(List<Don> don) {
			this.don = don;
		}
		

}
