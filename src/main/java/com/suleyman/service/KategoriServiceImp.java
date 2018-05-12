package com.suleyman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suleyman.dao.KategoriDao;

import com.suleyman.model.Kategori;

@Service
public class KategoriServiceImp implements KategoriService{

	@Autowired
	KategoriDao kategoriDao;
	
	@Override
	public List<Kategori> findAll() {
		// TODO Auto-generated method stub
		return kategoriDao.findAll();
	}

	@Override
	public Kategori findOne(int id) {
		// TODO Auto-generated method stub
		return kategoriDao.getOne(id);
	}

	@Override
	public Kategori saveKategori(Kategori kategori) {
		// TODO Auto-generated method stub
		return kategoriDao.save(kategori);
	}

	@Override
	public void deleteKategori(int id) {
		kategoriDao.deleteById(id);
	}

}
