package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.TauxDeclarationls;
import com.example.demo.service.TauxDeclarationlsService;



@RestController
@RequestMapping("stock-api/TauxDeclarationls")

public class TauxDeclarationlsRest {
	
	
	
	@Autowired
	private TauxDeclarationlsService  tauxDeclarationlsService;
	
	@GetMapping("/fiscale/{resultatFiscalMin,resultatFiscalMax}")
	public List<TauxDeclarationls> findByResultatfiscalMnGreaterThanAndResultatfiscalMxLessThan(double resultatFiscalMn,
			double resultatFiscalMx) {
		return tauxDeclarationlsService.findByResultatfiscalMnGreaterThanAndResultatfiscalMxLessThan(resultatFiscalMn,
				resultatFiscalMx);
	}
	

	@PostMapping("/")
	public int save(TauxDeclarationls tauxDeclarationls) {
		return tauxDeclarationlsService.save(tauxDeclarationls);
	}
	@GetMapping("/")
	public List<TauxDeclarationls> findAll() {
		return tauxDeclarationlsService.findAll();
	}

	

}