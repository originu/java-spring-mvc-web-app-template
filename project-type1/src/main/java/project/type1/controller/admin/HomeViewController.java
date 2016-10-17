package project.type1.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/admin/view/home/")
public class HomeViewController {
	
	
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String login(ModelMap model) {
    	model.addAttribute("user", "");
    	return "layouts/main";
    }
}
