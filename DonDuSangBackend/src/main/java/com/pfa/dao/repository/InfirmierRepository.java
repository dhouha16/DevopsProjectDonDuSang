package com.pfa.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pfa.entitties.Infirmier;
@CrossOrigin("*")
@RepositoryRestResource
public interface InfirmierRepository extends JpaRepository<Infirmier, Long>{
	@Query("select a from Infirmier a")
	public List<Infirmier>findAll();

}
