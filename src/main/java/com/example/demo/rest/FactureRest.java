package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Facture;
import com.example.demo.service.FactureService;
import com.example.demo.vo.FactureVo;

@RestController
@RequestMapping(value="stock/Facture")
public class FactureRest {
	@Autowired
	private FactureService factureService;
	

	@GetMapping("/IcesocieteSource/{icesocieteSource}")
	public Facture findByIcesocieteSource(@PathVariable String icesocieteSource) {
		return factureService.findByIcesocieteSource(icesocieteSource);
	}
	
	@GetMapping("/IcesocieteDestination/{icesocieteDestination}")
	public Facture findByIcesocieteDestination(@PathVariable String icesocieteDestination) {
		return factureService.findByIcesocieteDestination(icesocieteDestination);
	}
	@PostMapping("/criteria")
	public List<Facture> findByCriteria(@RequestBody FactureVo factureVo){
		return factureService.findByCriteria(factureVo);
	}

	@PostMapping("/")
	public int save(@RequestBody Facture facture) {
		return factureService.save(facture);
	}

	@GetMapping("/")
	public List<Facture> findAll() {
		return factureService.findAll();
	}

	@DeleteMapping("/")
	public void delete(@PathVariable Facture entity) {
		factureService.delete(entity);
	}
}
