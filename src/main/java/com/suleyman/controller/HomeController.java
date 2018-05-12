package com.suleyman.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String  homePage() {
		return "homePage";
	}
	
	@RequestMapping("/soruEkle")
	public String soruEklePage() {
		
		return "soruEkle";
	}
	
	@RequestMapping("/sorulariGetir")
	public String sorularıGetir() {	
		return "sorulariGetir";
	}
	

	


}
