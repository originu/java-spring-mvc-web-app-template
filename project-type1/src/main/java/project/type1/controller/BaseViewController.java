package project.type1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseViewController {

	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
    public ModelAndView indexPage() {
		ModelAndView	mav	= new ModelAndView("layouts/main");
        mav.addObject("greeting", "Hi, Welcome to mysite. ");
        return mav;
    }
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
    	model.addAttribute("user", getPrincipal());
    	return "layouts/login1";
    }
 
    @RequestMapping(value="/logout", method = RequestMethod.GET)
       public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
          Authentication auth = SecurityContextHolder.getContext().getAuthentication();
          if (auth != null){    
             new SecurityContextLogoutHandler().logout(request, response, auth);
          }
          return "redirect:/login?logout";
       }
 
    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "accessDenied";
    }

//	// Login form with error
//	@RequestMapping("/login-error")
//	public String loginError(Model model) {
//		model.addAttribute("loginError", true);
//		return "login";
//	}
    
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
    
}

