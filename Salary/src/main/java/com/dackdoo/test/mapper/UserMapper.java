package com.dackdoo.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dackdoo.test.model.AlldtoModel;
import com.dackdoo.test.model.BossModel;
import com.dackdoo.test.model.UserModel;

@Repository
@Mapper
public interface UserMapper {
	public abstract List<BossModel> getDept();
	public abstract List<BossModel> getHobby();
	public abstract List<BossModel> searchUserName(String user_nm);
	public abstract List<BossModel> getAllUser(BossModel bossModel);
	public abstract int regUser(BossModel bossModel);
	
	public abstract int updUser(UserModel user);
	public abstract int delUser(UserModel user);
}
