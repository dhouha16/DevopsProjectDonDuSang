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

import lombok.NoArgsConstructor;

import com.pfa.entitties.Infirmier;
@Entity
@Table(name="DON")

public class Don implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_DON")	
	private Long id;
	@Column(name="NB_POCHE")	
	private int nb_poche;
	@Column(name="DATE_DON")	
	private Date date_don;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="INFIRMIER_ID")
	private Infirmier infirmier;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ANALYSE_ID")
	private Analyse analyse;

	public Don() {
		super();
	}
	public Don(Long id, int nb_poche, Date date_don,Infirmier infirmier,Analyse analyse) {
		super();
		this.id = id;
		this.nb_poche = nb_poche;
		this.date_don = date_don;
		this.infirmier=infirmier;
		this.analyse=analyse;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNb_poche() {
		return nb_poche;
	}
	public void setNb_poche(int nb_poche) {
		this.nb_poche = nb_poche;
	}
	public Date getDate_don() {
		return date_don;
	}
	public void setDate_don(Date date_don) {
		this.date_don = date_don;
	}
	public Infirmier getInfirmier() {
		return infirmier;
	}
	public void setInfirmier(Infirmier infirmier) {
		this.infirmier = infirmier;
	}
	public Analyse getAnalyse() {
		return analyse;
	}
	public void setAnalyse(Analyse analyse) {
		this.analyse = analyse;
	}
	

	
	
}
