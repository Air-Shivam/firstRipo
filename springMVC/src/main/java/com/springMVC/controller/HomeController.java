package com.springMVC.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("thsi is home");
		model.addAttribute("name","Shivam Joshi");
		model.addAttribute("id",1234);
		
		List<String> list=new ArrayList<String>();
		list.add("aana");
		list.add("pooja");
		list.add("nik");
		list.add("yogi");
		list.add("pawan");
		
		
		model.addAttribute("friend", list);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is bout");
		return "about";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is bout");
		ModelAndView mv=new ModelAndView();
		mv.addObject("name","Shivammmm");
		mv.addObject("id",351515);
		List<String> list=new ArrayList<String>();
	 	list.add("aana");
		list.add("pooja");
		list.add("nik");
		list.add("yogi");
		list.add("pawan");
		mv.addObject("f", list);
		return mv;
	}
}
