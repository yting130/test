package com.j156.mybatis.usermag.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.j156.mybatis.bean.PageBean;
import com.j156.mybatis.bean.UserBean;
import com.j156.mybatis.usermag.service.IUserService;

public class UserServiceImplTest {
	private IUserService userServiceImpl;

	@Before
	public void before() {
		userServiceImpl = new UserServiceImpl();
	}

	/**
	 * 分页
	 */
	@Test
	public void pageUser() {
		PageBean pager = new PageBean(1, 5);
		Map<String,String> params = new HashMap<String,String>();
		params.put("employeeName","王");
		pager = userServiceImpl.listUserPagerBeanByParams(params, pager);
		
		List<UserBean> datas = (List<UserBean>) pager.getDatas();
		System.out.println(pager);
		
	}
	
	/**
	 * 批量插入
	 */
	@Test
	public void insert() {
		ArrayList<UserBean> list = new ArrayList<>();
		list.add(new UserBean("fdf", "fdfd"));
		userServiceImpl.saveBatchUser(list);
	}
	
	/**
	 * 批量删除
	 */
	@Test
	public void del() {
		Long[] ids={111L,144L};
		int num = userServiceImpl.deleteBatchUser(ids);
		System.out.println(num);
	}
	

}
