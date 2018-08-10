package com.j156.mybatis.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.j156.mybatis.bean.PageBean;
import com.j156.mybatis.bean.UserBean;
import com.j156.mybatis.usermag.dao.IUserDao;
import com.j156.mybatis.usermag.dao.impl.UserDaoImpl;
import com.j156.mybatis.usermag.service.IUserService;

/**
 * 用户业务实例类
 * 
 * @author yt
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDaoImpl;

	@Override
	public int saveUser(UserBean user) {
		// TODO Auto-generated method stub
		return userDaoImpl.saveUser(user);
	}

	@Override
	public int updateUser(UserBean user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUser(user);
	}

	@Override
	public int deleteUser(UserBean user) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUser(user);
	}

	@Override
	public UserBean getUserById(int id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserById(id);
	}

	@Override
	public PageBean listUserPagerBeanByParams(Map params, PageBean page) {
		// 分页统计查询
		int totalRows = userDaoImpl.countUserByParams(params);
		// 当统计后的结果大于0，才开始获取分页数据
		if (totalRows > 0) {
			params.put("index", page.getIndex());
			params.put("rows", page.getRows());
			List<UserBean> datas = userDaoImpl.listUserByParams(params);
			page.setTotalRows(totalRows);
			page.setDatas(datas);
		}
		return page;
	}

	@Override
	public int deleteBatchUser(Long[] ids) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteBatchUser(ids);
	}

	@Override
	public int saveBatchUser(List<UserBean> user) {
		// TODO Auto-generated method stub
		return userDaoImpl.saveBatchUser(user);
	}

}
