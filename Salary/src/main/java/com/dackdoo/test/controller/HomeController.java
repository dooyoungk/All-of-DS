package com.dackdoo.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dackdoo.test.model.AlldtoModel;

@Controller
public class HomeController {

	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String goHome(HttpServletRequest req) {
		//uService.searchUserName(alldtoModel, req); // 사원 이름 검색
		return "content/home";
	}
	

	
}
