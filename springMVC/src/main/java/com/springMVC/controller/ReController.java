package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("Hello one");
//		
////		return "redirect:/enjoy";
//		
//		
//	}
	
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.print("Hello one");	
		RedirectView rv=new RedirectView();
		rv.setUrl("/enjoy");
		return rv;
		
	}
	@RequestMapping("/enjoy")
	public String enjoy() {
		System.out.print("Hello enjoy");	
		return "";
	}
}
