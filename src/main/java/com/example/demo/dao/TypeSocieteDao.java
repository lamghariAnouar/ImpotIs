package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.TypeSociete;

public interface TypeSocieteDao extends JpaRepository<TypeSociete, Long>{

	public TypeSociete findByCode(String code);
	List<TypeSociete> findByLibelle(String libelle);
	int deleteByCode(String Code);
}
