package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Facture;
import com.example.demo.dao.FactureDao;
@Service
public class FactureService {
	@Autowired
	private FactureDao factureDao;

	

	//@Autowired
	//SocieteService societeservice;

	public Facture findByIcesocieteSource(String icesocieteSource) {
		return factureDao.findByIcesocieteSource(icesocieteSource);
	}

	public Facture findByIcesocieteDestination(String icesocieteDestination) {
		return factureDao.findByIcesocieteDestination(icesocieteDestination);
	}

	public int save(Facture facture) {
		if(findByIcesocieteDestination(facture.getIcesocieteDestination())!=null) {
		return -1;
		}
		if(findByIcesocieteSource(facture.getIcesocieteSource())!= null) {
			return -2;
			}
			else {
			factureDao.save(facture);
			return 1;
		}
	}

	public List<Facture> findAll() {
		return factureDao.findAll();
	}

	public void delete(Facture entity) {
		factureDao.delete(entity);
	}
}