package com.suleyman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.suleyman.model.CoktanSecmeli;

import com.suleyman.service.CoktanSecmeliService;
import com.suleyman.service.KategoriService;


@Controller
public class CoktanSecmeliController {

	@Autowired
	CoktanSecmeliService coktanSecmeliService;
	
	@Autowired
	KategoriService kategoriService;
	
	@RequestMapping("/coktanSecmeliSoruOlustur")
	public String klasikSoruOlustur(Model model) {
		model.addAttribute("coktan",new CoktanSecmeli());
		model.addAttribute("kategoriler",kategoriService.findAll());
		return "coktanSecmeli"	;
		
	}
	
	@RequestMapping(value="/coktanSecmeliSoruEkle",method=RequestMethod.POST)
	public String klasikSoruKaydet(CoktanSecmeli coktanSecmeli) {
		coktanSecmeliService.saveCoktanSecmeli(coktanSecmeli) ;
	    return "redirect:/";
	}
	

	
	
}
