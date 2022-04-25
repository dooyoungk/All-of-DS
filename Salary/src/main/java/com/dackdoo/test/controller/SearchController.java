package com.dackdoo.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dackdoo.test.model.AlldtoModel;
import com.dackdoo.test.model.BossModel;
import com.dackdoo.test.service.UserService;

@Controller
public class SearchController {
	@Autowired
	private UserService uService;
	
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public String goSearch(BossModel bossModel, HttpServletRequest req) {
		uService.searchUserName(req); // 사원 이름 검색
		//uService.getAllUser(bossModel, req);
		return "content/home";
	}
	
	@ResponseBody
	@RequestMapping(value="/search2", method= {RequestMethod.GET,RequestMethod.POST},
			produces="application/xml; charset=UTF-8")
	public String searchUser(BossModel bossModel, HttpServletRequest req) {
		uService.getAllUser(bossModel, req);
		return "content/home";
	}
}
