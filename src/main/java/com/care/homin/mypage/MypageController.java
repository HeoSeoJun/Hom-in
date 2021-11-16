package com.care.homin.mypage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {
	
	@RequestMapping("mypage")
	public String mypage(Model model, String id) {
		
		model.addAttribute("id", id);
		model.addAttribute("formpath", "mypage/mypageForm");
		return "index";
	}
	
	@RequestMapping("mypage/info/mgmt")
	public String infoMgmt(Model model) {
		
		model.addAttribute("formpath", "mypage/info/mgmt");
		return "index";
	}
}
