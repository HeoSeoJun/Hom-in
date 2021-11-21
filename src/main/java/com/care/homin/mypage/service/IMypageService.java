package com.care.homin.mypage.service;

import com.care.homin.membership.dto.AllDTO;
import com.care.homin.membership.dto.PostcodeDTO;

public interface IMypageService {
	public AllDTO infoMgmt(String id);
	public boolean deleteProc(String id);
	public PostcodeDTO addr(String id);
}
