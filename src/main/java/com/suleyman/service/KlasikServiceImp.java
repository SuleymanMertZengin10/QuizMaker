package com.suleyman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suleyman.dao.KlasikDao;
import com.suleyman.model.Klasik;

@Service
public class KlasikServiceImp implements KlasikService{
    
       
	
	  @Autowired
	  KlasikDao klasikDao;
	
	@Override
	public List<Klasik> findAll() {
	
		return klasikDao.findAll();
	}

	@Override
	public Klasik findOne(int id) {
	
		return klasikDao.getOne(id);
	}

	@Override
	public Klasik saveKlasik (Klasik klasik) {
		// TODO Auto-generated method stub
		return klasikDao.save(klasik);
	}

	@Override
	public void deleteKlasik (int id) {
		klasikDao.deleteById(id);
		
	}

	@Override
	public  List<Klasik> dereceyeGoreSoruGetir(String zorlukDerecesi) {
		
		return klasikDao.dereceyeGoreSoruGetir(zorlukDerecesi);
	}

	@Override
	public List<Klasik> kategoriyeGoreSoruGetir(String kategori) {
		// TODO Auto-generated method stub
		return klasikDao.kategoriyeGoreSoruGetir(kategori);
	}
	


	
}
