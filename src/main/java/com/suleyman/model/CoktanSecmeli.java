package com.suleyman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CoktanSecmeli {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	private String 	soru;
	private String cevapA;
	private String cevapB;
	private String cevapC;
	private String cevapD;
	private String dogruCevap;
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
	public String getCevapA() {
		return cevapA;
	}
	public void setCevapA(String cevapA) {
		this.cevapA = cevapA;
	}
	public String getCevapB() {
		return cevapB;
	}
	public void setCevapB(String cevapB) {
		this.cevapB = cevapB;
	}
	public String getCevapC() {
		return cevapC;
	}
	public void setCevapC(String cevapC) {
		this.cevapC = cevapC;
	}
	public String getCevapD() {
		return cevapD;
	}
	public void setCevapD(String cevapD) {
		this.cevapD = cevapD;
	}
	public String getDogruCevap() {
		return dogruCevap;
	}
	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
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
	@Override
	public String toString() {
		return "CoktanSecmeli [id=" + id + ", soru=" + soru + ", cevapA=" + cevapA + ", cevapB=" + cevapB + ", cevapC="
				+ cevapC + ", cevapD=" + cevapD + ", dogruCevap=" + dogruCevap + ", zorlukDerecesi=" + zorlukDerecesi
				+ ", soruPuani=" + soruPuani + ", kategori=" + kategori + "]";
	}
	
	
	
	
	
	
	
	
}
