package com.care.homin.mypageAdmin.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.homin.login.dto.LoginDTO;
import com.care.homin.membership.dto.AllDTO;
import com.care.homin.membership.dto.MemberDTO;
import com.care.homin.membership.dto.PostcodeDTO;
import com.care.homin.mypageAdmin.repository.IMypageAdminDAO;

@Service
public class MypageAdminServiceImpl implements IMypageAdminService{
	@Autowired IMypageAdminDAO adminDao;
	
	@Override
	public String deleteUser(String id) {
		boolean dt_confirm = adminDao.deleteUser(id);
		String result="";
		if (dt_confirm == true) {
			result = "삭제 처리 완료!";
		} else {
			result = "삭제 처리를 실패하였습니다";
		}
		return result;
	}

	@Override
	public ArrayList<MemberDTO> manage() {
		ArrayList<MemberDTO> list = adminDao.manageList();
		return list;
	}

	@Override
	public AllDTO manageUser(int no) {
		MemberDTO memberDto = adminDao.infoMemberByNo(no);
		LoginDTO loginDto = adminDao.infoLogin(memberDto.getId());
		AllDTO allDto = new AllDTO();
		if (loginDto != null && memberDto != null) {
			allDto.setNo(memberDto.getNo());
			allDto.setId(loginDto.getId());
			allDto.setNickname(memberDto.getNickname());
			allDto.setPhone(memberDto.getPhone());
			allDto.setEmail(memberDto.getEmail());
			return allDto;
		} else {
			return null;
		}
	}

	@Override
	public ArrayList<PostcodeDTO> addrList() {
		ArrayList<PostcodeDTO> list = adminDao.addrList();
		return list;
	}

}
