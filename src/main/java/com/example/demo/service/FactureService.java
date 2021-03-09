package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Facture;
import com.example.demo.dao.FactureDao;
import com.example.demo.vo.FactureVo;
@Service
public class FactureService {
	@Autowired
	private FactureDao factureDao;
	

	

	//@Autowired
	//SocieteService societeservice;

	public List<Facture> findByCriteria(FactureVo factureVo){
		String query="SELECT f FROM Facture f WHERE 1=1 ";
		if(factureVo.getMontantHtMin()!=null && !factureVo.getMontantHtMin().isEmpty())
			query+=" AND f.montantHt >='"+factureVo.getMontantHtMin()+"'";
		if(factureVo.getMontantHtMax()!=null && !factureVo.getMontantHtMax().isEmpty())
			query+=" AND f.montantHt <='"+factureVo.getMontantHtMax()+"'";
		if(factureVo.getMontantTtcMin()!=null && !factureVo.getMontantTtcMin().isEmpty())
			query+=" AND f.montantTtc <='"+factureVo.getMontantTtcMin()+"'";
		if(factureVo.getMontantTtcMax()!=null && !factureVo.getMontantTtcMax().isEmpty())
			query+=" AND f.montantTtc >='"+factureVo.getMontantTtcMax()+"'";
		if(factureVo.getMontantTvaMin()!=null && !factureVo.getMontantTvaMin().isEmpty())
			query+=" AND f.montantTva >='"+factureVo.getMontantTvaMin()+"'";
		if(factureVo.getMontantTvaMax()!=null && !factureVo.getMontantTvaMax().isEmpty())
			query+=" AND f.montantTva <='"+factureVo.getMontantTvaMax()+"'";
		return entityManager.createQuery(query).getResultList();
	}
	public Facture findByIcesocieteSource(String icesocieteSource) {
		return factureDao.findByIcesocieteSource(icesocieteSource);
	}

	public Facture findByIcesocieteDestination(String icesocieteDestination) {
		return factureDao.findByIcesocieteDestination(icesocieteDestination);
	}

	public int save(Facture facture) {
		if(findByIcesocieteDestination(facture.getIcesocieteDestination())!=null || findByIcesocieteSource(facture.getIcesocieteSource())!= null) {
		return -1;
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
	@Autowired
	private EntityManager entityManager;
}