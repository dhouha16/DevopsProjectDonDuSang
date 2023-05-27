package com.pfa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.dao.repository.AnalyseRepository;
import com.pfa.dao.repository.ReponseRepository;
import com.pfa.entitties.Response;
import com.pfa.service.IResponseService;
@Service
public class ResponseServiceImpl implements IResponseService {
	@Autowired
	ReponseRepository reponseRepository;
	@Autowired
	AnalyseRepository analyseRepository;
	@Override
	public Response getResponse(Response resp) {
		Response res=reponseRepository.findById(resp.getId()).orElse(null);
		return res;
	}

	

}
