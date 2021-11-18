package com.care.homin.mypage;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.homin.membership.dto.AllDTO;
import com.care.homin.membership.dto.MemberDTO;
import com.care.homin.mypage.service.IMypageService;
import com.care.homin.mypage.service.MypageServiceImpl;

@Controller
public class MypageController {
	@Autowired IMypageService mypageSvc;
	
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
	
	@RequestMapping("mypage/info/manage")
	public String infoManage(Model model) {
		ArrayList<MemberDTO> list = mypageSvc.infoManage();
		
		model.addAttribute("list", list);
		model.addAttribute("formpath", "mypage/info/manage");
		return "index";
	}
	
	@RequestMapping("mypage/info/mgus")
	public String infoMgUs(Model model, String no) {
		AllDTO allDto = mypageSvc.infoMgUs(Integer.parseInt(no));
		
		if (allDto != null)
			model.addAttribute("allDto", allDto);
		model.addAttribute("formpath", "mypage/info/mgus");
		return "index";
	}
}
