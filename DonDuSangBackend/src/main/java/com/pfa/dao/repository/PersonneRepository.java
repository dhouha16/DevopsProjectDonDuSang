package com.pfa.dao.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.domain.Pageable;


import org.springframework.web.bind.annotation.CrossOrigin;




import com.pfa.entitties.Demande;
import com.pfa.entitties.DemandePersonne;
import com.pfa.entitties.Personne;
@CrossOrigin("*")
@RepositoryRestResource
public interface PersonneRepository extends JpaRepository<Personne, Long>{
	@RestResource(path="/ByCin")
	@Query("select e from Personne e where e.cin =:mc")
	public List<Personne> findByCin(@Param("mc")int cin);
	
	@RestResource(path="/ByCinPage")
	@Query("select e from Personne e where e.cin =:mc")
	public Page<Personne> findByCin(@Param("mc")int cin, Pageable page);
	
	@RestResource(path="/ByNomPage")
	@Query("select e from Personne e where e.nom =:mc")
	public Page<Personne> findByNom(@Param("mc")String cin , Pageable page);
	

	@RestResource(path="/ByPage")
	public Page<Personne> findAll(Pageable page);
	
	
	
	/*@RestResource(path="/ByAllPage")
	public Page<Personne> findAll(Pageable page);*/
	
	/*@RestResource(path="/ByNomm")
	@Query("select e from Personne e where e.nom=:mc")
	public Page<Personne> findByNom(@Param("mc") String mom, Pageable pageable);*/

	@RestResource(path="/ByNom")
	public Page<Personne> findByNomContains(@Param("mc")String nom, Pageable pageable);
	
	
	@Query(value="SELECT p.id,p.nom FROM Personne p")
	public List<Personne> findAllInfo();

	
	@RestResource(path="/addp")
	@Query("SELECT p FROM Personne p")
	public List<Personne> findAllp();
	
	
}
