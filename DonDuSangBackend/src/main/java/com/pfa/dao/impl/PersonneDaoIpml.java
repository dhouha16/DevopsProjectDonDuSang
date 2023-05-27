package com.pfa.dao.impl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.pfa.dao.IPersonneDao;
import com.pfa.dao.repository.PersonneRepository;
import com.pfa.entitties.Personne;
@Service
public class PersonneDaoIpml implements IPersonneDao {

	@Autowired
	PersonneRepository personneRepository;
	
	
	@Override
	public Personne addPersonne(Personne personne) {
		return  personneRepository.save(personne);
	}


	@Override
	public List<Personne> getAllPersonne() {
		
		return personneRepository.findAll();
	}


	/*@Override
	public Page<Personne> getAllPersonneParPage(int cin,Pageable pageable) {
		
		return personneRepository.findByCinContains(cin, pageable);
	}*/


}
