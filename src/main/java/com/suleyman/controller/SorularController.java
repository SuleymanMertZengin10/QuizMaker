package com.suleyman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suleyman.model.CoktanSecmeli;
import com.suleyman.model.DogruYanlis;
import com.suleyman.model.Klasik;
import com.suleyman.service.CoktanSecmeliService;
import com.suleyman.service.DogruYanlisService;
import com.suleyman.service.KategoriService;
import com.suleyman.service.KlasikService;

@Controller
public class SorularController {
	
	@Autowired
	KlasikService klasikService;
	
	@Autowired
	DogruYanlisService dogruYanlisService;
	
	@Autowired
	CoktanSecmeliService coktanSecmeliServise;
	
	@Autowired
	KategoriService kategoriService;
	

	@RequestMapping("/dereceyeGöre")
	public String zorlukDercesineGore() {
		
		return "dereceyeGoreSoruGetir";
		
	}
	@RequestMapping("/kategoriyeGöre")
	public String kategoriyeGore(Model model) {
		model.addAttribute("kategoriler",kategoriService.findAll());
		
		return "kategoriyeGoreSoruGetir";
		
	}
	 
	@RequestMapping("/puanaGöre")
	public String puanaGore() {
		
		return "puanaGoreSoruGetir";
		
	}
	

	 
	@RequestMapping("/sorular/{soruDerecesi}")
	public String sorulariGetir(@PathVariable(required = false, name = "soruDerecesi") String soruDerecesi,Model model){
		   if (null!=soruDerecesi) {
	            model.addAttribute("Klasiksoru", klasikService.dereceyeGoreSoruGetir(soruDerecesi));
	            model.addAttribute("DogruYanlisSoru", dogruYanlisService.dereceyeGoreSoruGetir(soruDerecesi));
	            model.addAttribute("CoktanSecmeliSoru", coktanSecmeliServise.dereceyeGoreSoruGetir(soruDerecesi));
	            
	        } else {
	            model.addAttribute("soru", new Klasik());
	            model.addAttribute("soru", new DogruYanlis());
	            model.addAttribute("soru", new CoktanSecmeli());
	        }

		   
	     return "sorular";
	}
	
	@RequestMapping("/sorularKategori/{kategori}")
	public String sorulariGetir2(@PathVariable(required = false, name = "kategori") String kategori,Model model){
		   if (null!=kategori) {
			   System.out.println(coktanSecmeliServise.kategoriyeGoreSoruGetir(kategori));
			   model.addAttribute("CoktanSecmeliSoru", coktanSecmeliServise.kategoriyeGoreSoruGetir(kategori));
			   model.addAttribute("DogruYanlisSoru", dogruYanlisService.kategoriyeGoreSoruGetir(kategori));
			   model.addAttribute("Klasiksoru", klasikService.kategoriyeGoreSoruGetir(kategori));
	            
	        } else {
	            model.addAttribute("soru", new Klasik());
	            model.addAttribute("soru", new DogruYanlis());
	            model.addAttribute("soru", new CoktanSecmeli());
	        }

		   
	     return "sorular";
	}
	 
	 
	

}
