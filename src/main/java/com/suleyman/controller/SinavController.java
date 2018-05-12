package com.suleyman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SinavController {

	@RequestMapping("/sinav")
	public String sinavOlusturmaSayfası() {
		
		return "sinavOlustur";
	}
	
}
