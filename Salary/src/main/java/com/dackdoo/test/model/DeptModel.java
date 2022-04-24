package com.dackdoo.test.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder @Data
public class DeptModel {
	private String dept_no;
	private String dept_nm;
	private String dept_upper_no;
	
}
