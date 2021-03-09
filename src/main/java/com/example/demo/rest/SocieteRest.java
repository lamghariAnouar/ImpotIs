package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Societe;
import com.example.demo.bean.TypeSociete;
import com.example.demo.service.SocieteService;

@RestController
@RequestMapping("stock-api/societe")
public class SocieteRest {

	@Autowired
	private SocieteService societeService;

	@GetMapping("/ice/{ice}")
	public Societe findByIce(@PathVariable String ice) {
		return societeService.findByIce(ice);
	}

	@GetMapping("/siegeSociale/{siegeSociale}")
	public List<Societe> findBySiegesociale(@PathVariable String siegeSociale) {
		return societeService.findBySiegeSociale(siegeSociale);
	}

	/*@GetMapping("/type/{type}")
	public List<Societe> findByTypeSociete(TypeSociete typeSociete) {
		return societeService.findByTypeSociete(typeSociete);
	}*/

	@GetMapping("/")
	public List<Societe> findAll() {
		return societeService.findAll();
	}
	
	@PostMapping("/")
	public int save(@RequestBody Societe societe) {
		return societeService.save(societe);
	}

}

