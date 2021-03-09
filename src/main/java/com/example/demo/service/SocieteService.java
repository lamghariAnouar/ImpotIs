package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Societe;
import com.example.demo.bean.TypeSociete;
import com.example.demo.dao.SocieteDao;



@Service
public class SocieteService {

	@Autowired
	private SocieteDao societedao;

	public Societe findByIce(String ice) {
		return societedao.findByIce(ice);
	}

	public List<Societe> findBySiegeSociale(String siegeSociale) {
		return societedao.findBySiegeSociale(siegeSociale);
	}

	/*public List<Societe> findByTypeSociete(TypeSociete typeSociete) {
		//return societedao.findByTypeSociete(typeSociete);
		String query="SELECT s FROM Societe s WHERE 1=1 ";
		if(typeSociete.getCode()!=null)
			query+=" AND s.code LIKE '%"+typeSociete.getCode()+"'";
		return EntityManager.createQuery(query).getResultList();
	}*/

	public int deleteByTypeSocieteCode(String code) {
		return societedao.deleteByTypeSocieteCode(code);
	}

	public int save(Societe societe) {
		if(findByIce(societe.getIce())!=null)
		{
			return -1;
		}
		else
		{
			societedao.save(societe);
			return 1;
		}
	}

	public List<Societe> findAll() {
		return societedao.findAll();
	}

	
	
}
