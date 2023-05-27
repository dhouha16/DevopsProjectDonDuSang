package com.pfa.dao;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.pfa.entitties.Personne;

public interface IPersonneDao {
	Personne addPersonne(Personne personne);
	List<Personne> getAllPersonne();
/*	Page<Personne> getAllPersonneParPage(int cin,Pageable pageable);*/


}
