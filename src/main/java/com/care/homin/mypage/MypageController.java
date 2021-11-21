package com.care.homin.mypage;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.care.homin.login.dto.LoginDTO;
import com.care.homin.login.service.ILoginService;
import com.care.homin.membership.dto.AllDTO;
import com.care.homin.membership.dto.MemberDTO;
import com.care.homin.membership.dto.PostcodeDTO;
import com.care.homin.mypage.service.IMypageService;

@Controller
public class MypageController {
	private static final Logger logger = LoggerFactory.getLogger(MypageController.class);
	@Autowired IMypageService mypageSvc;
	@Autowired ILoginService loginSvc;
	
	@RequestMapping("mypage")
	public String mypage(Model model) {
		model.addAttribute("formpath", "mypage/mypageForm");
		return "index";
	}
	
	//사용자, 개인정보 조회
	@RequestMapping("mypage/info/mgmt")
	public String infoMgmt(Model model, String id) {
		AllDTO allDto = mypageSvc.infoMgmt(id);
		
		if (allDto != null)
			model.addAttribute("allDto", allDto);
		model.addAttribute("formpath", "mypage/info/mgmt");
		return "index";
	}
	//사용자, 주소지 조회
	@RequestMapping("mypage/info/addr")
	public String addr(Model model, String id) {
		PostcodeDTO pc = mypageSvc.addr(id);
		
		model.addAttribute("postCode", pc);
		model.addAttribute("formpath", "mypage/info/addr");
		return "index";
	}
	
	//사용자, 계정 탈퇴
	@RequestMapping("mypage/info/confirmPw")
	public String confirmPw(Model model) {
		return "mypage/info/confirmPw";
	}
	@ResponseBody
	@RequestMapping("mypage/info/pwCheck")
	public HashMap<String, String> idPwCheck(LoginDTO loginDto, @RequestBody HashMap<String, String> map) {
//		logger.warn("map : " + map.get("id"));
//		logger.warn("map : " + map.get("pw"));
		
		loginDto.setId(map.get("id"));
		loginDto.setPw(map.get("pw"));
//		logger.warn("loginDto : " + loginDto.getId());
//		logger.warn("loginDto : " + loginDto.getPw());
		
		MemberDTO chk = loginSvc.loginProc(loginDto);
		if (chk == null)
			map.put("msg", "비밀번호가 일치하지 않습니다.");
		else
			map.put("msg", "");
		return map;
	}
	@RequestMapping("mypage/info/deleteProc")
	public String deleteProc(LoginDTO loginDto, Model model, HttpSession session) {
//		logger.warn("loginDto.getId() : " + loginDto.getId());
//		logger.warn("loginDto.getPw() : " + loginDto.getPw());
		boolean bool = mypageSvc.deleteProc(loginDto.getId());
		if (bool) {
			session.invalidate();
			model.addAttribute("formpath", "home");
			return "index";
		} else {
			return "mypage/info/confirmPw";
		}
	}
	
}
