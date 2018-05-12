package com.suleyman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suleyman.model.DogruYanlis;
import com.suleyman.service.DogruYanlisService;
import com.suleyman.service.KategoriService;

@Controller
public class DogruYanlisController {
       
	 @Autowired
	 DogruYanlisService dogruYanliService;
	 
	 @Autowired
	KategoriService kategoriService;
	 
		
		@RequestMapping("/dogruYanlisSoruOlustur")
		public String klasikSoruOlustur(Model model) {
			
			model.addAttribute("dogruYanlis",new DogruYanlis());
			model.addAttribute("kategoriler",kategoriService.findAll());
			
			return "dogruYanlis";
			
		}
		
		@RequestMapping(value="/dogruYanlisSoruEkle",method=RequestMethod.POST)
		public String klasikSoruKaydet(DogruYanlis dogruYanlis) {
			dogruYanliService.saveDogruYanlis(dogruYanlis);
		    return "redirect:/";
		
		}
	
}
