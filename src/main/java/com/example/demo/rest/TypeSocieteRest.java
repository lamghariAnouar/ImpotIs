package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.TypeSociete;
import com.example.demo.service.TypeSocieteService;

@RestController
@RequestMapping("stock-api/typeSociete")
public class TypeSocieteRest {
	@Autowired
	private TypeSocieteService typeSocieteService;

	@GetMapping("/code/{code}")
	public TypeSociete findByCode(@PathVariable String code) {
		return typeSocieteService.findByCode(code);
	}
	@GetMapping("/Libelle/{Libelle}")
	public List<TypeSociete> findByLibelle(@PathVariable String libelle) {
		return typeSocieteService.findByLibelle(libelle);
	}

	@PostMapping("/")
	public int save(@RequestBody TypeSociete typeSociete) {
		return typeSocieteService.save(typeSociete);
	}

	@GetMapping("/")
	public List<TypeSociete> findAll() {
		return typeSocieteService.findAll();
	}

}

