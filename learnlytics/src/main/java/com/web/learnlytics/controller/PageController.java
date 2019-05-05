package com.web.learnlytics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"},method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Home Page ");
		return mv;
		
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam("greeting")String greeting){		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("greeting","Greeting");
		mv.addObject("userClickAbout",true);
		return mv;				
	}	
	
	
	
}
