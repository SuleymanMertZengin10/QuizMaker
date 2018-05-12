package com.suleyman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suleyman.dao.CoktanSecmeliDao;
import com.suleyman.model.CoktanSecmeli;

@Service
public class CoktanSecmeliServiceImp implements CoktanSecmeliService{
    
	@Autowired
	CoktanSecmeliDao coktanSecmeliDao;
	
	
	
	@Override
	public List<CoktanSecmeli> findAll() {
		// TODO Auto-generated method stub
		return  coktanSecmeliDao.findAll();
	}

	@Override
	public CoktanSecmeli findOne(int id) {
		// TODO Auto-generated method stub
		return coktanSecmeliDao.getOne(id);
	}

	@Override
	public CoktanSecmeli saveCoktanSecmeli(CoktanSecmeli coktanSecmeli) {
		
		return coktanSecmeliDao.save(coktanSecmeli);
	}

	@Override
	public void deleteCoktanSecmeli(int id) {
		coktanSecmeliDao.deleteById(id);
		
		
	}

	@Override
	public List<CoktanSecmeli> dereceyeGoreSoruGetir(String zorlukDerecesi) {
		// TODO Auto-generated method stub
		return coktanSecmeliDao.dereceyeGoreSoruGetir(zorlukDerecesi);
		
	}

	@Override
	public List<CoktanSecmeli> kategoriyeGoreSoruGetir(String kategori) {
		// TODO Auto-generated method stub
		return coktanSecmeliDao.kategoriyeGoreSoruGetir(kategori);
	}

	
}
