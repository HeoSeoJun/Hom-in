package com.care.homin.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.care.homin.login.dao.ILoginDAO;
import com.care.homin.login.dto.LoginDTO;

@Service
public class LoginServiceImpl implements ILoginService{
	@Autowired private ILoginDAO loginDao;
	
	public LoginDTO loginProc(LoginDTO loginDto) {
		LoginDTO chk = loginDao.loginProc(loginDto.getId());
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		if (chk != null && encoder.matches(loginDto.getPw(), chk.getPw())) {
//		회원가입 시 비밀번호 '암호화' 적용 후 활성화			
		if (chk != null && loginDto.getPw().equals(chk.getPw())) {
			return chk;
		} else {
			return null;
		}
	}
	
}
