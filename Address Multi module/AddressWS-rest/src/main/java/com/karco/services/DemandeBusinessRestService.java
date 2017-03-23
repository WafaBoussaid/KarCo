package com.karco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karco.entities.Demande;
import com.karco.entities.User;
import com.karco.interfaces.DemandeBusiness;


@RestController
public class DemandeBusinessRestService {
	
	@Autowired
	private DemandeBusiness demandeBusiness;


	@CrossOrigin(origins = "http://localhost:8888")
	@RequestMapping(value = "/mocksuggestions", method = RequestMethod.POST)
	public Demande getSuggestions(@RequestBody Demande demande) {
		return demandeBusiness.mockSuggestions(demande);

	}


	@CrossOrigin(origins = "http://localhost:8888")
	@RequestMapping(value = "/suggestions", method = RequestMethod.POST)
	public Demande validate(@RequestBody Demande demande) {
		return demandeBusiness.validateSuggestion(demande);

	}
	

	@CrossOrigin(origins = "http://localhost:8888")
	@RequestMapping(value = "/getTripInfo", method = RequestMethod.POST)
	public Demande getTripInfo(@RequestBody Demande demande) {
		return demandeBusiness.getTripInfo(demande);

	}
	
	
	
	
}
