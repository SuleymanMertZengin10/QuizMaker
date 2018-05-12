package com.suleyman.service;

import java.util.List;


import com.suleyman.model.Kategori;

public interface KategoriService {


	  List<Kategori> findAll();

	  Kategori findOne(int id);

	  Kategori saveKategori (Kategori kategori);

	    void deleteKategori (int id);
	    
   
}
