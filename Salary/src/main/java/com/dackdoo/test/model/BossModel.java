package com.dackdoo.test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder @Data
@AllArgsConstructor
@NoArgsConstructor
public class BossModel {
	private String rownum;
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
