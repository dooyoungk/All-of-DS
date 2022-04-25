package com.dackdoo.test.model;

import lombok.Builder;
import lombok.Data;

@Builder @Data
public class UserModel {
	private String user_id;
	private String user_nm;
	private String user_telno;
	private String user_addr;
	private String dept_no;
	private String dept_nm;
	private String dept_upper_no;
	private String hobby_no;
	private String hobby_nm;
}
