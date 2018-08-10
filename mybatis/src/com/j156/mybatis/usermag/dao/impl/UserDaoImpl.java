package com.j156.mybatis.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.j156.mybatis.annotation.MyLog;
import com.j156.mybatis.bean.UserBean;
import com.j156.mybatis.enmu.OperateLogEnum;
import com.j156.mybatis.usermag.dao.IUserDao;
import com.j156.mybatis.usermag.mapper.UserMapper;

/**
 * 用户持久实例类
 * 
 * @author yt
 *
 */
@Repository("userDaoImpl")
public class UserDaoImpl implements IUserDao {
	private SqlSession session;

	@MyLog(menuName = "用户管理", getType = OperateLogEnum.SAVE)
	@Override
	public int saveUser(UserBean user) {
		return session.getMapper(UserMapper.class).saveUser(user);
	}

	@MyLog(menuName = "用户管理", getType = OperateLogEnum.UPDATE)
	@Override
	public int updateUser(UserBean user) {

		return session.getMapper(UserMapper.class).updateUser(user);
	}

	@MyLog(menuName = "用户管理", getType = OperateLogEnum.DELETE)
	@Override
	public int deleteUser(UserBean user) {

		return session.getMapper(UserMapper.class).deleteUser(user);
	}

	@Override
	public UserBean getUserById(int id) {
		// TODO Auto-generated method stub
		return session.getMapper(UserMapper.class).getUserById(id);
	}

	@Override
	public int countUserByParams(Map params) {
		// TODO Auto-generated method stub
		return session.getMapper(UserMapper.class).countUserByParams(params);
	}

	@Override
	public List<UserBean> listUserByParams(Map params) {
		// TODO Auto-generated method stub
		return session.getMapper(UserMapper.class).listUserByParams(params);
	}

	@Override
	public int deleteBatchUser(Long[] ids) {
		// TODO Auto-generated method stub
		return session.getMapper(UserMapper.class).deleteBatchUser(ids);
	}

	@Override
	public int saveBatchUser(List<UserBean> user) {
		// TODO Auto-generated method stub
		return session.getMapper(UserMapper.class).saveBatchEmployee(user);
	}

}
