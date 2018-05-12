package com.suleyman.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suleyman.model.Kategori;

@Repository
public interface KategoriDao extends JpaRepository<Kategori, Integer>{

}
