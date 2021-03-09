package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Facture;


@Repository
public interface FactureDao extends JpaRepository<Facture,Long> {
	Facture findByIcesocieteSource(String icesocieteSource);
	Facture findByIcesocieteDestination(String icesocieteDestination);
	//List <Facture> findBySocieteIce(String ice);
	//int deleteBySocieteIce(String ice);
}
