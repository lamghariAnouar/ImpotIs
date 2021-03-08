package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.TauxDeclarationls;

@Repository
public interface TauxDeclarationlsDao extends JpaRepository<TauxDeclarationls, Long> {
	List<TauxDeclarationls>findByResultatFiscalMnGreaterThanAndResultatFiscalMxLessThan(Double  ResultatFiscalMn,Double ResultatFiscalMx);
	
	
}