package com.pfa.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pfa.entitties.DemandePersonne;
import com.pfa.entitties.ReponsePersonne;
import com.pfa.entitties.Response;
@RepositoryRestResource
public interface ReponseRepository extends JpaRepository<Response, Long>{
	@Query("SELECT new com.pfa.entitties.ReponsePersonne(r.id,p.nom,p.prenom,p.email,p.telephone,p.sexe,d.description,d.dateDebut,d.dateFin,r.dateResponse) FROM Response r JOIN r.personne p JOIN r.demande d")
	public List<ReponsePersonne> findAllInfo();
	public Optional<Response> findByPersonne(String tel);
	
	 @Query("select t from Response t where t.id =:mc")
	    List<Response> findByIdd(@Param("mc")Long mc);
	

}
