package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.bean.DeclarationIs;



public interface DeclarationIsDao extends JpaRepository<DeclarationIs, Long>{
	DeclarationIs findByref(String ref);
	List<DeclarationIs> findByiceSociete(String iceSociete);
	List<DeclarationIs> findByresultatFiscale(String resultatFiscale);
	//void delateByref(String ref);

}

