package com.dackdoo.test.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dackdoo.test.mapper.UserMapper;
import com.dackdoo.test.model.AlldtoModel;
import com.dackdoo.test.model.BossModel;
import com.dackdoo.test.model.UserModel;

@Service
public class UserService {
	@Autowired
	private SqlSession ss;
	//@Autowired
	//public UserMapper uMapper;
	
	
	// 이름검색
	public void searchUserName(HttpServletRequest req) {
		try {
			String user_nm = req.getParameter("user_nm");
			List<BossModel> users = ss.getMapper(UserMapper.class).searchUserName(user_nm);
			req.setAttribute("users", users);	
			
			System.out.println(users);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 상세정보조회
	public List<BossModel> getAllUser(BossModel bossModel, HttpServletRequest req) {
		try {
			System.out.println("hey");
			List<BossModel> users = ss.getMapper(UserMapper.class).getAllUser(bossModel);
			req.setAttribute("users", users);			
			//req.setAttribute("ul", ul.get(0));			
			//System.out.println(ul.get(0));
			System.out.println(users);
			return users;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void regUser(BossModel bossModel, HttpServletRequest req) {
		try {
			
			int deptList = ss.getMapper(UserMapper.class).regUser(bossModel);
			if (ss.getMapper(UserMapper.class).regUser(bossModel) == 1) {
				System.out.println("등록성공");
			}	
			System.out.println(deptList);
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
