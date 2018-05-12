package com.suleyman.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suleyman.model.Klasik;
import com.suleyman.service.KategoriService;
import com.suleyman.service.KlasikService;

@Controller
public class KlasikController {

	@Autowired
	KlasikService klaskService;
	
	@Autowired
	KategoriService kategoriService;
	
	@RequestMapping("/klasikSoruOlustur")
	public String klasikSoruOlustur(Model model) {
		
		model.addAttribute("klasik",new Klasik());
		model.addAttribute("kategoriler",kategoriService.findAll());
		
		return "klasikSoru"	;
		
	}
	
	@RequestMapping(value="/klasikSoruEkle",method=RequestMethod.POST)
	public String klasikSoruKaydet( Klasik klasikSoru) {
		System.out.println(klasikSoru.getSoruKategorisi());
		klaskService.saveKlasik(klasikSoru);
	    
	    return "redirect:/";
	}
	
	
	
		
	
}
