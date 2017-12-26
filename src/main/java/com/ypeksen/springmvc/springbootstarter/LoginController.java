package com.ypeksen.springmvc.springbootstarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//url parcasi eklemek icin value'yu doldur. orn: value="/giris"
//istenmiyorsa bos birak. orn: value=""

@Controller
@RequestMapping(value="/giris")
public class LoginController {
	
	@RequestMapping(value="/jsp", method = RequestMethod.GET)
	public ModelAndView girisJsp(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("sav");
		modelAndView.addObject("userid", 233);
		return modelAndView;
	}
	
	@RequestMapping(value="/thymeleaf", method = RequestMethod.GET)
	public ModelAndView girisThymeleaf(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("userid", 233);
		return modelAndView;
	}
	
}
