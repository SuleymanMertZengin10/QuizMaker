package com.suleyman.service;

import java.util.List;

import com.suleyman.model.DogruYanlis;




public interface DogruYanlisService {


	  List<DogruYanlis> findAll();

	  DogruYanlis findOne(int id);

	  DogruYanlis saveDogruYanlis (DogruYanlis notes);

	    void deleteDogruYanlis (int id);
	    
	   List<DogruYanlis> dereceyeGoreSoruGetir(String zorlukDerecesi);
	   
	   List<DogruYanlis> kategoriyeGoreSoruGetir(String kategori);
		  
}
