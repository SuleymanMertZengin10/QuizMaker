package com.suleyman.service;

import java.util.List;

import com.suleyman.model.CoktanSecmeli;



public interface CoktanSecmeliService {

	  List<CoktanSecmeli> findAll();

	  CoktanSecmeli findOne(int id);

	  CoktanSecmeli saveCoktanSecmeli(CoktanSecmeli coktanSecmeli);

	  void deleteCoktanSecmeli(int id);
	   
	  List<CoktanSecmeli> dereceyeGoreSoruGetir(String zorlukDerecesi);
	  
	  List<CoktanSecmeli> kategoriyeGoreSoruGetir(String kategori);

 
}
