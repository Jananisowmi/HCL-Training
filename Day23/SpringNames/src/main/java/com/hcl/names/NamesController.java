package com.hcl.names;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NamesController {
	@RequestMapping("/name")
	public ModelAndView namedemo() {
		List<String> lstNames=new ArrayList<String>();
		lstNames.add("Jaanu");
		lstNames.add("Janu");
		lstNames.add("Sowmi");
		lstNames.add("Baby");
		lstNames.add("Velu");
		return new ModelAndView("ShowPage","lists",lstNames);
		
		
	}

}
