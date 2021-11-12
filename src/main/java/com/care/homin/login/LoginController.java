package com.care.homin.login;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.homin.login.dto.LoginDTO;
import com.care.homin.login.service.LoginServiceImpl;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired private LoginServiceImpl loginSvc;
	@RequestMapping("login")
	public String login(){
		return "login/loginForm";
	}
	
	@RequestMapping("loginProc")
	public String loginProc(LoginDTO loginDto, HttpSession session) {
//		logger.warn("id : "+loginDto.getId());
//		logger.warn("pw : "+loginDto.getPw());
		LoginDTO chk = loginSvc.loginProc(loginDto);
		if (chk == null) 
			return "login/loginForm";
		
		session.setAttribute("no", chk.getNo());
		session.setAttribute("id", chk.getId());
		return "index";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}
}
