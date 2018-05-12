package com.suleyman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suleyman.dao.DogruYanlisDao;
import com.suleyman.model.DogruYanlis;

@Service
public class DogruYanlisServiceImp implements DogruYanlisService{
     
	@Autowired
	 DogruYanlisDao dogruYanlisDao;
	
	@Override
	public List<DogruYanlis> findAll() {
		// TODO Auto-generated method stub
		return dogruYanlisDao.findAll();
	}

	@Override
	public DogruYanlis findOne(int id) {
		// TODO Auto-generated method stub
		return dogruYanlisDao.getOne(id);
	}

	@Override
	public DogruYanlis saveDogruYanlis (DogruYanlis dogruYanlis) {
		// TODO Auto-generated method stub
		return dogruYanlisDao.save(dogruYanlis);
	}

	@Override
	public void deleteDogruYanlis (int id) {
	    
		dogruYanlisDao.deleteById(id);
	}

	@Override
	public List<DogruYanlis> dereceyeGoreSoruGetir(String zorlukDerecesi) {
		// TODO Auto-generated method stub
		return dogruYanlisDao.dereceyeGoreSoruGetir(zorlukDerecesi);
	}

	@Override
	public List<DogruYanlis> kategoriyeGoreSoruGetir(String kategori) {
		// TODO Auto-generated method stub
		return dogruYanlisDao.kategoriyeGoreSoruGetir(kategori);
	}
	
	

}
