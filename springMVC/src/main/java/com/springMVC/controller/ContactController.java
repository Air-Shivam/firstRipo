package com.springMVC.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springMVC.model.User;
import com.springMVC.service.UserService;

@Controller
public class ContactController {
    
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header","Learn casdinbhu");
		m.addAttribute("Desc", "Home for programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method = RequestMethod.POST )
	public String handleForm(@ModelAttribute User user, Model model){
		// processing user
		if(user.getUser_name().isBlank()) {
			return "redirect:/contact";
		}
        this.userService.createUser(user);
		return "success";
	}
	
	
}  
	
/*	@RequestMapping(path="/processform",method = RequestMethod.POST )
	public String handleForm(
			@RequestParam("email") String email,
			@RequestParam("name") String name,
			@RequestParam("password") String password, Model model) 
			                {
/*	1. by using Servelet rquest method
 * 	public String handleForm(HttpServletRequest request)
		String email=request.getParameter("email");
		System.out.println(email);		                */
		
/*		System.out.println(email);
		System.out.println(name);
		System.out.println(password);                   */
		
/*		model.addAttribute("name",name);
		model.addAttribute("email",email);
		model.addAttribute("password",password);         */
//		
//		User user=new User(name,email,password);
//	    System.out.println(user);
//        model.addAttribute("user", user);
//		
//		return "success";
		
		
	
	

