package com.suleyman.service;

import java.util.List;


import com.suleyman.model.Klasik;


public interface KlasikService {
	
	  List<Klasik> findAll();

	  Klasik findOne(int id);

	  Klasik saveKlasik (Klasik notes);

	  void deleteKlasik (int id);

	  List<Klasik> dereceyeGoreSoruGetir(String zorlukDerecesi);
	  
	  List<Klasik> kategoriyeGoreSoruGetir(String kategori);
	  
	  

}
