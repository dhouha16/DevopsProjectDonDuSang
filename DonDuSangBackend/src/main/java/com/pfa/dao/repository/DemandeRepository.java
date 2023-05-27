package com.pfa.dao.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pfa.entitties.Demande;
import com.pfa.entitties.DemandePersonne;
import com.pfa.entitties.Personne;
@CrossOrigin("*")
@RepositoryRestResource
public interface DemandeRepository extends JpaRepository<Demande, Long> {
	@RestResource(path="/demandes")
	public List<Demande> findAll();
	@Query("SELECT new com.pfa.entitties.DemandePersonne( p.nom,p.prenom,p.telephone,p.sexe,p.email,d.description,d.dateDebut,d.dateFin) FROM Demande d JOIN d.personne p")
	public List<DemandePersonne> findAllInfo();
	
	@RestResource(path="/demandespage")
	@Query("SELECT new com.pfa.entitties.DemandePersonne( p.nom,p.prenom,p.telephone,p.sexe,p.email,d.description,d.dateDebut,d.dateFin) FROM Demande d JOIN d.personne p")
	public Page<DemandePersonne> findAllpage(Pageable page);
	
	
}
