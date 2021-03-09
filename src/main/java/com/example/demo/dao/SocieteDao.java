package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Societe;
import com.example.demo.bean.TypeSociete;




@Repository
public interface SocieteDao extends JpaRepository<Societe, Long>{
	public Societe findByIce(String ice);
	List<Societe> findBySiegeSociale(String siegeSociale);
	//List<Societe> findByTypeSociete(TypeSociete typeSociete);
	int deleteByTypeSocieteCode(String code);
	
	/*@Query("SELECT s FROM Societe s WHERE s.TypeSociete = .:type")
	List<Societe> findByTypeSociete(@Param("type")TypeSociete type);*/
}
