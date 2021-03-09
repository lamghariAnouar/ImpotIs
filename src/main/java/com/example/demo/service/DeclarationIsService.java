package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.DeclarationIs;

import com.example.demo.dao.DeclarationIsDao;



@Service
public class DeclarationIsService {
	@Autowired
private DeclarationIsDao declarationIsDao;
	
	/*public void delateByref(String ref) {
		declarationIsDao.delateByref(ref);
	}*/

	
	

	public DeclarationIs findByref(String ref) {
		return declarationIsDao.findByref(ref);
	}

	public List<DeclarationIs> findByiceSociete(String iceSociete) {
		return declarationIsDao.findByiceSociete(iceSociete);
	}

	public List<DeclarationIs> findByResultatfiscale(String resultatFiscale) {
		return declarationIsDao.findByresultatFiscale(resultatFiscale);
	}
	
	public String genererRef(DeclarationIs declarationIs) {
		String ref=Double.toString(declarationIs.getId()*45645/288);
		return ref;
		}

	public int save(DeclarationIs declarationIs) {
	 String ref=genererRef( declarationIs);
	 declarationIs.setRef(ref);
	 declarationIsDao.save(declarationIs);
	 return 1;
	}


	public List<DeclarationIs> findAll() {
		return declarationIsDao.findAll();
	}



}
