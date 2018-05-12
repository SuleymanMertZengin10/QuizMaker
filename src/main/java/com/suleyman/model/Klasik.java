package com.suleyman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Klasik {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String soru;
	private String zorlukDerecesi;
	private int puan;
	private String dogruCevap;
	private String soruKategorisi;
	
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
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	public String getDogruCevap() {
		return dogruCevap;
	}
	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}
	public String getSoruKategorisi() {
		return soruKategorisi;
	}
	public void setSoruKategorisi(String soruKategorisi) {
		this.soruKategorisi = soruKategorisi;
	}
	@Override
	public String toString() {
		return "Klasik [id=" + id + ", soru=" + soru + ", zorlukDerecesi=" + zorlukDerecesi + ", puan=" + puan
				+ ", dogruCevap=" + dogruCevap + ", soruKategorisi=" + soruKategorisi + "]";
	}

	
	
	
	
}
