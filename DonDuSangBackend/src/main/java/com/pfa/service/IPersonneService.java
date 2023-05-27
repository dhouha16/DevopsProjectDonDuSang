package com.pfa.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.pfa.entitties.Personne;

public interface IPersonneService {
	public Personne addPersonne(Personne personne);
	List<Personne> getAllPersonne();

	/*Page<Personne> getAllPersonneParPage(int cin,Pageable pageable);*/
}
