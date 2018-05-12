package com.suleyman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suleyman.model.Kategori;
import com.suleyman.service.KategoriService;

@Controller
public class KategoriController {
	
	@Autowired
	KategoriService kategoriService;
	
	@RequestMapping("/kategoriEkle")
	public String kategoriEkle(Model model) {
		Kategori kategori=new Kategori();
		model.addAttribute("kategori",kategori);
		return "kategoriEkle";
	}
	
	@RequestMapping("/kategoriKaydet") 
     public String kategoriKaydet(Kategori kategori) {
		kategoriService.saveKategori(kategori);
		return "redirect:/soruEkle";
 		
	}
	
}
