package net.enagape.base.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SiteController {
	
	/**
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("userId", "1");
		model.addAttribute("name", "Sangbon Suhk");
		model.addAttribute("authType", "1");
		return "blog/index";
	}
	
	/**
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping("/member/login")
	public String login(Model model) {
		return "blog/login";
	}
	
	/**
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping("/member/logout")
	public String logout(Model model) {
		return "blog/index";
	}
}
