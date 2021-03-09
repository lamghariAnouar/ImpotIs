package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Facture;
import com.example.demo.service.FactureService;

@RestController
@RequestMapping(value="stock/Facture")
public class FactureRest {
	@Autowired
	private FactureService factureService;

	@GetMapping("/IcesocieteSource/{icesocieteSource}")
	public Facture findByIcesocieteSource(String icesocieteSource) {
		return factureService.findByIcesocieteSource(icesocieteSource);
	}
	
	@GetMapping("/IcesocieteDestination/{icesocieteDestination}")
	public Facture findByIcesocieteDestination(String icesocieteDestination) {
		return factureService.findByIcesocieteDestination(icesocieteDestination);
	}

	@PostMapping("/")
	public int save(Facture facture) {
		return factureService.save(facture);
	}

	@GetMapping("/")
	public List<Facture> findAll() {
		return factureService.findAll();
	}

	/*@PostMapping("/")
	public void delete(Facture entity) {
		factureService.delete(entity);
	}*/
}
