package com.care.homin.membership.dao;

import com.care.homin.membership.dto.MemberDTO;

/*
CREATE TABLE member_homin (
no NUMBER,
id VARCHAR2(20),
nickname VARCHAR2(20),
phone VARCHAR2(20),
email VARCHAR2(20),
PRIMARY KEY(no),
CONSTRAINT fk_member_homin FOREIGN KEY(id) REFERENCES login_homin ON DELETE CASCADE
);

CREATE SEQUENCE no_member_homin START WITH 1 INCREMENT BY 1

CREATE TABLE postcode_homin (
id VARCHAR2(20),
zipcode VARCHAR2(5),
addr1 VARCHAR2(180),
addr2 VARCHAR2(100),
CONSTRAINT fk_postcode_homin FOREIGN KEY(id) REFERENCES login_homin ON DELETE CASCADE
);

 */
public interface IMemberDAO {
	MemberDTO memberProc(String id);

}
