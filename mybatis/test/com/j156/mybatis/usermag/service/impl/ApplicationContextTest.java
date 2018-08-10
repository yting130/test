package com.j156.mybatis.usermag.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.j156.mybatis.bean.UserBean;
import com.j156.mybatis.usermag.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ApplicationContextTest {

	@Resource
	private IUserService userServiceImpl;

	
	@Test
	public void saveUserBean() {

		UserBean user = new UserBean();
		user.setId(1);
		user.setUserName("张三");
		user.setUserPwd("4dsadsds");
		userServiceImpl.saveUser(user);
	}

}
