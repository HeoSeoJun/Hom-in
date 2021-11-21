package com.care.homin.mypageAdmin.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.homin.login.dto.LoginDTO;
import com.care.homin.membership.dto.MemberDTO;
import com.care.homin.membership.dto.PostcodeDTO;

@Repository
public interface IMypageAdminDAO {

	boolean deleteUser(String id);

	ArrayList<MemberDTO> manageList();

	LoginDTO infoLogin(String id);

	MemberDTO infoMemberByNo(int no);

	ArrayList<PostcodeDTO> addrList();
	
}
