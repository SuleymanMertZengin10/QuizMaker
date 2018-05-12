package com.suleyman.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.suleyman.model.DogruYanlis;

@Repository
public interface DogruYanlisDao extends JpaRepository<DogruYanlis, Integer> {

	  @Query("SELECT k FROM DogruYanlis k WHERE k.zorlukDerecesi=:zorlukDerecesi")
	  List<DogruYanlis> dereceyeGoreSoruGetir(@Param("zorlukDerecesi") String zorlukDerecesi);
	  
	  
	  @Query("SELECT k FROM DogruYanlis k WHERE k.kategori=:kategori")
	  List<DogruYanlis> kategoriyeGoreSoruGetir(@Param("kategori") String kategori);
}
