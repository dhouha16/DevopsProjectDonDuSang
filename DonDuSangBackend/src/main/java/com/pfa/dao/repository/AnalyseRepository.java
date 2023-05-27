package com.pfa.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pfa.entitties.Analyse;
import com.pfa.entitties.ReponsePersonne;
import com.pfa.entitties.Response;


public interface AnalyseRepository extends JpaRepository<Analyse, Long>{
	//@Query("select new com.pfa.entitties.AnalyseResponse(a.DateDon,a.description,r.dateResponse,r.dateDon,p.nom,p.prenom,p.email,p.telephone,p.sexe) from Analyse a Join a.response r where exist(secle ")
	//List<Analyse>findAllAnalyse();
	 @Query(nativeQuery = true,value = "Select a.description,r.dateResponse,r.dateDon,p.nom,p.prenom,p.email,p.telephone,p.sexe from Analyse a,Response r,Personne p Where r.Id=a and p.id=r")
	    public List<Analyse> findAllAnalyse();
	/* @Query("SELECT e.enquiryId AS enquiryId, e.doe AS doe, e.committedFees AS fees, c.name AS name, c.phone AS phone,"
	            + " (SELECT count(followupId) FROM Followup f WHERE e=f.enquiry) AS followUpCount,"
	            + " (SELECT group_concat(co.name) FROM Course co, EnquiryCourse ec WHERE e=ec.enquiry AND ec.course=co) AS courses "
	            + " FROM Enquiry e, Contact c WHERE e.contact=c and e.institute.instituteId=?1")
	    public List<Analyse> getEnquiryDTOList(Long instituteId);*/

	
}
