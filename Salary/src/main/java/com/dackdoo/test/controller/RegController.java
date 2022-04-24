package com.dackdoo.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dackdoo.test.model.BossModel;
import com.dackdoo.test.model.UserModel;
import com.dackdoo.test.service.UserService;

@Controller
public class RegController {
	
	@Autowired
	UserService uService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String regUser(BossModel bossModel, HttpServletRequest req) {
		//List<UserModel> deptList = uService.getAllUser(userModel, req);
		uService.regUser(bossModel, req);
		//req.setAttribute("deptList", deptList);
		 return "content/home";
	}
}
