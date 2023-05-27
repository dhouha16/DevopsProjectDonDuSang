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

import com.pfa.entitties.Analyse;

@Entity
@Table(name="ANALYSE")
public class Analyse implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_RESULTAT")	
	private Long id;
	@Column(name="DATE_DON")	
	private Date DateDon;	
	@Column(name="DESCRIPTION")	
	private String description;
	private boolean analyseAccepter;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="RESPONSE_ID")
	private Response response;
	
	
	public Analyse() {
		super();
	}
	
	public Analyse(Date DateDon, String description,boolean analyseAccepter ,Response response) {
		super();
		
		this.DateDon = DateDon;
		this.description = description;
		
		this.analyseAccepter=analyseAccepter;
		this.response=response;
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate_don() {
		return DateDon;
	}
	public void setDate_don(Date DateDon) {
		DateDon =DateDon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public Date getDateDon() {
		return DateDon;
	}

	public void setDateDon(Date dateDon) {
		DateDon = dateDon;
	}

	public boolean isAnalyseAccepter() {
		return analyseAccepter;
	}

	public void setAnalyseAccepter(boolean analyseAccepter) {
		this.analyseAccepter = analyseAccepter;
	}

	@Override
	public String toString() {
		return "Analyse [id=" + id + ", DateDon=" + DateDon + ", description="
				+ description + ", analyseAccepter=" + analyseAccepter
				+ ", response=" + response + ", getId()=" + getId()
				+ ", getDate_don()=" + getDate_don() + ", getDescription()="
				+ getDescription() + ", getResponse()=" + getResponse()
				+ ", getDateDon()=" + getDateDon() + ", isAnalyseAccepter()="
				+ isAnalyseAccepter() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

	

}
