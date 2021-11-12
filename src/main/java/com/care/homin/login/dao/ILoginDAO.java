package com.care.homin.login.dao;

import org.springframework.stereotype.Repository;

import com.care.homin.login.dto.LoginDTO;

/*
CREATE TABLE login_homin (
no NUMBER,
id VARCHAR2(20),
pw VARCHAR2(180),
PRIMARY KEY(no, id)
);

CREATE SEQUENCE no_login_homin START WITH 1 INCREMENT BY 1;
 */
@Repository
public interface ILoginDAO {

	LoginDTO loginProc(String id);
	
}
