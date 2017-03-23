package com.karco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karco.entities.Address;
import com.karco.interfaces.AddressBusiness;

@RestController
public class AddressBusinessRestService {
	@Autowired
	private AddressBusiness addressBusiness;

	@CrossOrigin(origins = "http://localhost:8888")
	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public List<Address> getAddressByFilter(@RequestParam String voie) {
		return addressBusiness.getAddressByFilter(voie);

	}
}
