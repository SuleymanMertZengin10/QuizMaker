package com.suleyman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kategori {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String dersAdi;
public String getDersAdi() {
	return dersAdi;
}
public void setDersAdi(String dersAdi) {
	this.dersAdi = dersAdi;
}
   
   
	
}
