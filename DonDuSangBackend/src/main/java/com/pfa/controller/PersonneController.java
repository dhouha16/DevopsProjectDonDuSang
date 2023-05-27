package com.pfa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.aspectj.bridge.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;









import com.pfa.dao.IAnalyseDao;
import com.pfa.dao.impl.AnalyseDaoImpl;
import com.pfa.dao.repository.AnalyseRepository;
import com.pfa.dao.repository.InfirmierRepository;
import com.pfa.dao.repository.ReponseRepository;
import com.pfa.dao.repository.DemandeRepository;
import com.pfa.dao.repository.PersonneRepository;
import com.pfa.dto.Analysedto;
import com.pfa.entitties.Analyse;
import com.pfa.entitties.Demande;
import com.pfa.entitties.DemandePersonne;
import com.pfa.entitties.Infirmier;
import com.pfa.entitties.Personne;
import com.pfa.entitties.ReponsePersonne;
import com.pfa.entitties.Response;
import com.pfa.service.IAnalyseService;
import com.pfa.service.IPersonneService;
import com.pfa.service.IResponseService;
@CrossOrigin("*")
@RestController
public class PersonneController {
	private static final String MSG_404_GROCERY = null;

	@Autowired
	IPersonneService iPersonneService;
	@Autowired
	PersonneRepository personneRepository;
	@Autowired
	DemandeRepository demandeRepository;
	@Autowired
	ReponseRepository reponseRepository;
	@Autowired
	IAnalyseService analyseDaoImpl;
	@Autowired
	AnalyseRepository analyseRepository;
	@Autowired
	InfirmierRepository infirmierRepository;
	@Autowired
	IResponseService responseService;
	

	
	@PostMapping("/listePersonne/{id}")
	public void ajouterPersonne(@RequestBody Personne p, @PathVariable Long id){
	
		iPersonneService.addPersonne(p);
		}
	@PutMapping("/listePersonnee/{id}")
	public void modifierPersonne(@RequestBody Personne p, @PathVariable(name="id") Long id){
		p.setId(id);
		personneRepository.save(p);
		}
	@PostMapping("/listePersonnee")
	public void save(@RequestBody Personne p){
		personneRepository.save(p);
		}

	
	
	@GetMapping("/personne")
	public List<Personne> getAllPersonne(){
	//	System.out.println("---------------------------------------------------------"+personneRepository.findAllInfo().get(2));
		return personneRepository.findAll();
		
	}
	@GetMapping("/personnesLi")
	public List<Personne> getAllPersonneParPage(
		@RequestParam(name = "page", defaultValue = "0") int p) {
		return iPersonneService.getAllPersonne();
		
	}
	
	/*@GetMapping("/personnelist")
	public List<Personne> getAllP(){
		Personne p=new Personne();	
		return personneRepository.findAllp();
		
	}*/
	/*@GetMapping("/demandeList")
	public List<Object[]> getDemandelist(Demande demande, List<Object[]> result){
		List<Demande> printerTypeList = demandeRepository.findAll();
	
		if (demande!= null) {

			if (printerTypeList.contains(demande)) {
				
				result = demandeRepository
						.findAlldem(
								demande.getPersonne().getNom(),
								demande.getPersonne().getPrenom(),
								demande.getPersonne().getSexe(),
								demande.getPersonne().getTelephone()
								);
				System.out.println("after findByColorAndTypeAndModeAndSize");
				}
			else 
				System.out.println();
		
	}
		return result;
		
	}*/
	
	@GetMapping("/demandeLi")
	public List<DemandePersonne> getAllDemande(){
		return demandeRepository.findAllInfo();
		
	}
	@GetMapping("/responseLi")
	public List<ReponsePersonne> getAllResponse(){
		return reponseRepository.findAllInfo();
		
	}
	@GetMapping("/responseLi/{id}")
	public List<Response> getResponse(@PathVariable Long id){
		List<Response> res = reponseRepository.findByIdd(id);
		
		
		return res ;}
		
	
	@GetMapping("/getAnalyse")
	public  List<Analyse> getAllAnalyse(){
		return analyseRepository.findAllAnalyse();
	}

	@PostMapping("/Infirmier")
	public  Infirmier addInfirmier(@RequestBody Infirmier infirmier)
	{
		return infirmierRepository.save(infirmier);
	}

	@GetMapping("/getInfirmier")
	public  List<Infirmier> getAllInfirmier(){
		return infirmierRepository.findAll();
	}
	@GetMapping("/getAnalysee")
	public  List<HashMap<String, Object> >getAllAnalysee(){
		return analyseDaoImpl.getAllAnalysee();
	}
	@PostMapping("/saveAnalyse")
	public void save(@RequestBody Analyse p){
		analyseRepository.save(p);
		} 
	@PostMapping("/analyseSave/{id}")
	public void ajouterAnalyse(@RequestBody Analyse p, @PathVariable Long id){
		Response c=reponseRepository.findById(id).get();
		p.setResponse(c);
		analyseRepository.save(p);
	}
	
	@PostMapping("/SaveanalyseByTelephone")
	public void ajouterAnalyseByTel(@RequestBody Analyse ana){
		Response resp=new Response();
	analyseDaoImpl.getResponseByTelephone(resp);
	}
	@PostMapping("/add")
	public void ajoutAnalyse(@RequestBody Analysedto analyse){
		
	 analyseDaoImpl.addAnalyse(analyse);
	}
}
