package com.pfa.service;

import java.util.HashMap;
import java.util.List;

import com.pfa.dto.Analysedto;
import com.pfa.entitties.Analyse;
import com.pfa.entitties.Response;

public interface IAnalyseService {
	//public List<HashMap<String,Object>>getAllAnalysee();
	public List<HashMap<String, Object> > getAllAnalysee();
	public boolean SaveAnalyse();
	boolean SaveAnalyse(Response response); 
	public Analyse getResponseByTelephone(Response res);
	public Analyse addAnalyse(Analysedto analyse);

	


}
