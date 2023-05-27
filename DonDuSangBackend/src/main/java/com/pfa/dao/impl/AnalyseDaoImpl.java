package com.pfa.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.dao.IAnalyseDao;
import com.pfa.dao.repository.AnalyseRepository;
import com.pfa.entitties.Analyse;

@Service
public class AnalyseDaoImpl implements IAnalyseDao{
	@Autowired
	AnalyseRepository analyseRepository;
	Analyse analyse;

	//@Override
/*	public List<HashMap<String, Object>> getAllAnalyse() {
		 List<HashMap<String, Object>> result = new ArrayList<HashMap<String, Object>>();
		 HashMap<String, Object> analyseList = new HashMap<String, Object>();
		 Long index=analyse.getId();
		 if(index!=0){
		 analyseList.put("nom", analyse.getResponse().getPersonne().getPrenom());
		 analyseList.put("prenom", analyse.getResponse().getPersonne().getPrenom());
		 analyseList.put("description", analyse.getDescription());
		 analyseList.put("telephone", analyse.getResponse().getPersonne().getTelephone());
		 analyseList.put("sexe", analyse.getResponse().getPersonne().getSexe());
		
		 
		 
		 Iterator<HashMap<String, Object>> i = result.iterator();
		    while (i.hasNext()) {
		    	result.add(analyseList);
		      System.out.println(i.next());
		    }
		 //result.add(analyseList);
		 }else System.out.println("impossible");
		    		    return result;
		}*/


}
