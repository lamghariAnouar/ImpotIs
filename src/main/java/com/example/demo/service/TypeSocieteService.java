package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.TypeSociete;
import com.example.demo.dao.TypeSocieteDao;

@Service
public class TypeSocieteService {

	@Autowired
	private TypeSocieteDao typeSocieteDao;

	public TypeSociete findByCode(String code) {
		return typeSocieteDao.findByCode(code);
	}

	public List<TypeSociete> findByLibelle(String libelle) {
		return typeSocieteDao.findByLibelle(libelle);
	}

	public int save(TypeSociete typeSociete) {
		if(findByCode(typeSociete.getCode())!=null)
		{
			return -1;
		}
		else
		{
			typeSocieteDao.save(typeSociete);
			return 1;
		}
	}

	public List<TypeSociete> findAll() {
		return typeSocieteDao.findAll();
	}
}
