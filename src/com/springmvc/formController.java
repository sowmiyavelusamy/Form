 package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class formController {
	
	@RequestMapping (value="/login", method=RequestMethod.GET)
	public ModelAndView admissionform(){
		ModelAndView movi = new ModelAndView("LoginForm");
		movi.addObject("logindetail", "entered into login form");
		return movi;
		
		}
	@RequestMapping(value="/submission.html")
	public  ModelAndView submissionForm(){
		ModelAndView sendTosuccess = new ModelAndView("Signsuccess");
		sendTosuccess.addObject("success", "cresdentials are correct");
		return sendTosuccess;

	}

}
