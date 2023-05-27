package com.pfa.service.impl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.stereotype.Service;


import com.pfa.dao.IPersonneDao;
import com.pfa.entitties.Personne;
import com.pfa.service.IPersonneService;
@Service
public class PersonneServiceImpl implements IPersonneService {
@Autowired
IPersonneDao ipersonneDao;

	@Override
	public Personne addPersonne(Personne personne) {
		// TODO Auto-generated method stub
		return ipersonneDao.addPersonne(personne);
	}
	@Override
	public List<Personne> getAllPersonne() {
		// TODO Auto-generated method stub
		return ipersonneDao.getAllPersonne();
	}
	/*@Override
	public Page<Personne> getAllPersonneParPage(int cin, Pageable pageable) {
		
		return ipersonneDao.getAllPersonneParPage(cin, pageable);
	}*/

	
	

}
