package com.suleyman.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.suleyman.model.Klasik;
@Repository
public interface KlasikDao extends JpaRepository<Klasik, Integer>{

	  @Query("SELECT k FROM Klasik k WHERE k.zorlukDerecesi=:zorlukDerecesi")
	  List<Klasik> dereceyeGoreSoruGetir(@Param("zorlukDerecesi") String zorlukDerecesi);
	  
	  
	  @Query("SELECT k FROM Klasik k WHERE k.soruKategorisi=:soruKategorisi")
	  List<Klasik> kategoriyeGoreSoruGetir(@Param("soruKategorisi") String soruKategorisi);
	  
	
	
}
