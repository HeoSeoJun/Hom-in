package com.care.homin;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("index")
	public String index(HttpServletRequest req, Model model) {
		String formpath = req.getParameter("formpath");
		switch (formpath) {
		case "member":
			model.addAttribute("formpath", "member/memberForm");
			break;
		default:
			model.addAttribute("formpath", "home");
			break;
		}
		return "index";
	}
	
}
