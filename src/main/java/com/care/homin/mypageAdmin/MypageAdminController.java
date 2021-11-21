package com.care.homin.mypageAdmin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.care.homin.membership.dto.AllDTO;
import com.care.homin.membership.dto.MemberDTO;
import com.care.homin.membership.dto.PostcodeDTO;
import com.care.homin.mypageAdmin.service.IMypageAdminService;

@Controller
public class MypageAdminController {
	@Autowired IMypageAdminService adminSvc;
	
	//관리자, 회원 목록
	@RequestMapping("mypage/info/manage")
	public String manage(Model model) {
		ArrayList<MemberDTO> list = adminSvc.manage();
		
		model.addAttribute("list", list);
		model.addAttribute("formpath", "mypage/info/manage");
		return "index";
	}
	//관리자, 주소 목록
	@RequestMapping("mypage/info/addrList")
	public String addrList(Model model) {
		ArrayList<PostcodeDTO> list = adminSvc.addrList();
		
		model.addAttribute("list", list);
		model.addAttribute("formpath", "mypage/info/addrList");
		return "index";
	}
	
	//관리자, 회원 조회
	@RequestMapping("mypage/info/mgus")
	public String manageUser(Model model, String no) {
		AllDTO allDto = adminSvc.manageUser(Integer.parseInt(no));
		
		if (allDto != null)
			model.addAttribute("allDto", allDto);
		model.addAttribute("formpath", "mypage/info/mgus");
		return "index";
	}
	
	//관리자, 회원 삭제
	@RequestMapping("mypage/info/deleteUser")
	public String deleteUser(String id, Model model, RedirectAttributes ra) {
		String msg = adminSvc.deleteUser(id);
		
//		model.addAttribute("msg", msg);
//		model.addAttribute("formpath", "mypage/info/manage");
		
		ra.addFlashAttribute("msg", msg);
		ra.addFlashAttribute("formpath", "mypage/info/manage");
		
		return "redirect:manage";
	}
	
}
