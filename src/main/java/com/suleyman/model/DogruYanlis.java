package com.suleyman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DogruYanlis {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String soru;
	private String dogruOrYanlis;
	private String zorlukDerecesi;
	private int soruPuani;
	private String kategori;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoru() {
		return soru;
	}
	public void setSoru(String soru) {
		this.soru = soru;
	}

	public String getZorlukDerecesi() {
		return zorlukDerecesi;
	}
	public void setZorlukDerecesi(String zorlukDerecesi) {
		this.zorlukDerecesi = zorlukDerecesi;
	}
	public int getSoruPuani() {
		return soruPuani;
	}
	public void setSoruPuani(int soruPuani) {
		this.soruPuani = soruPuani;
	}
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public String getDogruOrYanlis() {
		return dogruOrYanlis;
	}
	public void setDogruOrYanlis(String dogruOrYanlis) {
		this.dogruOrYanlis = dogruOrYanlis;
	}
	
	
	
	
	
	
}
