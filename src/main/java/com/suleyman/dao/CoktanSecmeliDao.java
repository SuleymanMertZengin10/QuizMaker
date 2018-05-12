package com.suleyman.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.suleyman.model.CoktanSecmeli;


@Repository
public interface CoktanSecmeliDao extends JpaRepository<CoktanSecmeli, Integer> {

	  @Query("SELECT k FROM CoktanSecmeli k WHERE k.zorlukDerecesi=:zorlukDerecesi")
	  List<CoktanSecmeli> dereceyeGoreSoruGetir(@Param("zorlukDerecesi") String zorlukDerecesi);
	  
	  @Query("SELECT k FROM CoktanSecmeli k WHERE k.kategori=:kategori")
	  List<CoktanSecmeli> kategoriyeGoreSoruGetir(@Param("kategori") String kategori);
	
}
