package com.pfa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.dao.IAnalyseDao;
import com.pfa.dao.repository.AnalyseRepository;
import com.pfa.dao.repository.PersonneRepository;
import com.pfa.dao.repository.ReponseRepository;
import com.pfa.dto.Analysedto;
import com.pfa.entitties.Analyse;
import com.pfa.entitties.Personne;
import com.pfa.entitties.Response;
import com.pfa.service.IAnalyseService;
@Service
public class AnalyseService implements IAnalyseService {
	@Autowired
	IAnalyseDao analyse;
	@Autowired 
	AnalyseRepository analyseRepository;
	@Autowired
	ReponseRepository responseRepository;
	@Autowired
	PersonneRepository personneRepository;
	//@Override
	/*public List<HashMap<String, Object>> getAllAnalysee() {
		
		return analyse.getAllAnalyse();
	}*/

	@Override
	public List<HashMap<String, Object> > getAllAnalysee() {
		
		HashMap<String, Object> hash_map = new HashMap<String, Object>();
		List<Analyse> liste = analyseRepository.findAll();
		 for (Analyse item : liste){
		 hash_map.put("date don", item.getDate_don());
		 hash_map.put("date response", item.getResponse().getDateResponse());
		 hash_map.put("nom", item.getResponse().getPersonne().getNom());
		 hash_map.put("prenom", item.getResponse().getPersonne().getPrenom());
		 hash_map.put("telephone", item.getResponse().getPersonne().getTelephone());
		 hash_map.put("description", item.getDescription());
		 }
		 List<HashMap<String, Object> > listeMap=new ArrayList<HashMap<String,Object>>();
		 listeMap.add(hash_map);
		 
		return listeMap;
		
		
		/*Analyse anaylse=new Analyse();
		int j=0;
		List<Analyse> liste = analyseRepository.findAll();
		List<Object[]> listAna= new ArrayList<>(liste.size());
		
			 for (Analyse item : liste)
			 listAna.add(item.getDate_don());
		return liste;*/
	}
	/* public String updateBanque(Banque banque){

    Banque existingBanque = banqueRepository.findById(banque.getId()).orElse(null);

    existingBanque.setNom(banque.getNom());
    existingBanque.setCode(banque.getCode());
    existingBanque.setAddress(banque.getAddress());
    existingBanque.setClients(banque.getClients());
    existingBanque.setNbAgences(banque.getNbAgences());

    banqueRepository.save(existingBanque);
    return "la banque dont l'ID  = "+ banque.getId()+"est bien mettre a jour";

}*/

	@Override
	public boolean SaveAnalyse(Response response) {
		Response existingBanque = responseRepository.findById(response.getId()).orElse(null);
		Analyse analyse=new Analyse();
		analyse.getResponse().getId();
		analyse.getDescription();
		analyse.getDate_don();
		analyseRepository.save(analyse);
		return true;
	}

	@Override
	public boolean SaveAnalyse() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Analyse getResponseByTelephone(Response res) {
		
		Response r=responseRepository.findByPersonne(res.getPersonne().getTelephone()).orElse(null);
		
		Analyse analyse=new Analyse();
		analyse.setResponse(r);
		System.out.println("analyse est ajouté avec sucees");
		return analyseRepository.save(analyse);
		
		 }

	@Override
	public Analyse addAnalyse(Analysedto analysedto) {
		//Personne personne=personneRepository.findById(analysedto.getIdPersonne()).get();
		Response reponse= null;
		if(responseRepository.findById(analysedto.getIdReponse()).isPresent()){
			reponse=responseRepository.findById(analysedto.getIdReponse()).get();
		}	else {
			System.out.println("id response null**********************");
		return null;	
		}
		
		Analyse analyse=new Analyse();
		analyse.setDate_don(analysedto.getDate());
		analyse.setDescription(analysedto.getDescription());
		analyse.setAnalyseAccepter(analyse.isAnalyseAccepter());
		analyse.setResponse(reponse);
		return analyseRepository.save(analyse);
		
		
	}
		

	
	

}
