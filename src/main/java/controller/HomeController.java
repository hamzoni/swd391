package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import entity.User;
import model.DB;


@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index (ModelMap model) {
		
		User user = (User) model.get("user");
		model.addAttribute("message", user.getName());
		
		return "/welcome";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin (ModelMap model) {
		return "/login";
	}
	
	@RequestMapping(value = "/login/check", method = RequestMethod.POST)
	public ModelAndView checkLogin (ModelMap model, 
			@RequestParam("username") String username,
			@RequestParam("password") String password) {
		User user = null;
//		User user = DB.user.login(username, password);
//		model.addAttribute(user);
		
		if (user != null) return new ModelAndView("redirect:/home/index", model); 
		return new ModelAndView("redirect:/home/login"); 
	}
}
