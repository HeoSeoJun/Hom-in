package com.care.homin.mypageAdmin.service;

import java.util.ArrayList;

import com.care.homin.membership.dto.AllDTO;
import com.care.homin.membership.dto.MemberDTO;
import com.care.homin.membership.dto.PostcodeDTO;

public interface IMypageAdminService {

	String deleteUser(String id);

	ArrayList<MemberDTO> manage();

	AllDTO manageUser(int parseInt);

	ArrayList<PostcodeDTO> addrList();

}
