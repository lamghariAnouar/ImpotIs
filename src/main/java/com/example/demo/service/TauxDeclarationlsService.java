package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.TauxDeclarationls;
import com.example.demo.dao.TauxDeclarationlsDao;

@Service

public class TauxDeclarationlsService {
	@Autowired
	private TauxDeclarationlsDao tauxDeclarationlsDao ;
	public List<TauxDeclarationls>findByResultatfiscalMnGreaterThanAndResultatfiscalMxLessThan(double resultatFiscalMn,double resultatFiscalMx){
		return null;
	}
	public int save(TauxDeclarationls tauxDeclarationls){
		if(findByResultatfiscalMnGreaterThanAndResultatfiscalMxLessThan(tauxDeclarationls.getResultatFiscalMn(), tauxDeclarationls.getResultatFiscalMx())!=null) {
			return -1;
		}
		else {
			tauxDeclarationlsDao.save(tauxDeclarationls);
			return 1;
		}
	}

	public List<TauxDeclarationls> findAll() {
		return tauxDeclarationlsDao.findAll();
	}

	public void delete(TauxDeclarationls entity) {
		tauxDeclarationlsDao.delete(entity);
	}

	
}