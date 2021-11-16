package com.care.homin.login;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.homin.login.dto.LoginDTO;
import com.care.homin.login.service.LoginServiceImpl;
import com.care.homin.login.config.KakaoConfig;

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
	
	@Autowired KakaoConfig kakao;
	@RequestMapping("kakaoLogin")
	public String kakaoLogin(String code, HttpSession session) {
		logger.warn("code : " + code);
		
		String access_Token = kakao.getAccessToken(code);
		HashMap<String, Object> userInfo = kakao.getUserInfo(access_Token);
		session.setAttribute("nickname", userInfo.get("nickname"));
		session.setAttribute("id", userInfo.get("email"));
		session.setAttribute("access_Token", access_Token);
		return "login/loginForm";
	}
	
	@RequestMapping("logout")
	public String logout(HttpServletRequest req) {
		String access_Token = (String) req.getSession().getAttribute("access_Token");
		kakao.logout(access_Token);
		
		req.getSession().invalidate();
		return "index";
	}
	
	
}
