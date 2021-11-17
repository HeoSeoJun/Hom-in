package com.care.homin.mypage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.homin.membership.dto.AllDTO;
import com.care.homin.mypage.service.MypageServiceImpl;

@Controller
public class MypageController {
	@Autowired MypageServiceImpl mypageSvc;
	
	@RequestMapping("mypage")
	public String mypage(Model model) {
		
		model.addAttribute("formpath", "mypage/mypageForm");
		return "index";
	}
	
	@RequestMapping("mypage/info/mgmt")
	public String infoMgmt(Model model, String id) {
		AllDTO allDto = mypageSvc.infoMgmt(id);
		
		
		if (allDto != null)
			model.addAttribute("allDto", allDto);
		model.addAttribute("formpath", "mypage/info/mgmt");
		return "index";
	}
}
