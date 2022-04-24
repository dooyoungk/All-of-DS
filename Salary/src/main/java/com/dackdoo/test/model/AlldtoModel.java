package com.dackdoo.test.model;

import lombok.Builder;
import lombok.Data;

@Builder @Data
public class AlldtoModel {
	private String rownum;
	private String user_id;
	private String user_nm;
	private String dept_nm;

}
