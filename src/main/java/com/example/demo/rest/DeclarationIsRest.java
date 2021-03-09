package com.example.demo.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.DeclarationIs;
import com.example.demo.service.DeclarationIsService;


@RestController
@RequestMapping("impot/DeclarationIs")

public class DeclarationIsRest {
	@Autowired
private DeclarationIsService declarationIsService;
	
	
	/*public void delateByref(String ref) {
		declarationIsService.delateByref(ref);
	}*/

	//@ApiOperation("find a declaration by ref")
	@GetMapping("/ref/{ref}")
    public DeclarationIs findByref(@PathVariable String ref) {
		return declarationIsService.findByref(ref);
	}

	//@ApiOperation("find a declaration by iceSociete")
	@GetMapping("/iceSociete/{iceSociete}")
	public List<DeclarationIs> findByiceSociete(@PathVariable String iceSociete) {
		return declarationIsService.findByiceSociete(iceSociete);
	}
	
	@GetMapping("/resultatFiscale/{resultatFiscale}")
	public List<DeclarationIs> findByResultatfiscale(@PathVariable String resultatFiscale) {
		return declarationIsService.findByResultatfiscale(resultatFiscale);
	}
@PostMapping("/")
	public int save(@RequestBody DeclarationIs declarationIs) {
		return declarationIsService.save(declarationIs);
	}

@GetMapping("/")
	public List<DeclarationIs> findAll() {
		return declarationIsService.findAll();
	}

	
	

}
