package com.hcl.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		return new ModelAndView("result","message","Welcome to spring 3.0");
	}
		@RequestMapping("/jaanu")
	public 	ModelAndView jaanu() {
			return new ModelAndView("result","message","Jaanu Welcomes us");
	}
	

}
