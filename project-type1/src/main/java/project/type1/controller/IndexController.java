package project.type1.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

//	@RequestMapping(value = "/blog")
//	public ModelAndView getBlog(ModelAndView mv) {
//		mv.addObject("currentDate", new Date());
//		Writer writer = new Writer();
//		mv.addObject("writers", writer.getWriters());
//		mv.setViewName("myblog");
//		return mv;
//	}
//	
//	
//	@RequestMapping(value = "/", method = {RequestMethod.GET })
//	public String index(ModelAndView mv) {
//		return "index";
//	}
//
//	@RequestMapping(value = "/home", method = {RequestMethod.GET })
//	public String home(ModelAndView mv) {
//		return "index";
//	}
//	
//	// Login form
//	@RequestMapping(value = "/login.html")
//	public String login() {
//		return "login";
//	}
//
//	@RequestMapping(value = "/login2", method = {RequestMethod.POST })
//	public String login2() {
//		return "login";
//	}
//
//	// Login form with error
//	@RequestMapping("/login-error")
//	public String loginError(Model model) {
//		model.addAttribute("loginError", true);
//		return "login";
//	}
}

