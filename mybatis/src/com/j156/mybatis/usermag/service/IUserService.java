package com.j156.mybatis.usermag.service;

import java.util.List;
import java.util.Map;

import com.j156.mybatis.bean.PageBean;
import com.j156.mybatis.bean.UserBean;

/**
 * 用户业务接口
 * @author yt
 *
 */
public interface IUserService {
	/**
	 * 新增用户
	 * @param user 用户数据
	 * @return 数据库受影响的行数
	 */
	int saveUser(UserBean user);
	/**
	 * 批量新增职员
	 * @param user 职员数据
	 * @return 数据库受影响的行数
	 */
	int saveBatchUser(List<UserBean> user);
	
	/**
	 * 修改用户
	 * @param user 用户数据
	 * @return 数据库受影响的行数
	 */
	int updateUser(UserBean user);
	/**
	 * 删除用户
	 * @param user 用户数据
	 * @return 数据库受影响的行数
	 */
	int deleteUser(UserBean user);
	/**
	 * 查找用户
	 * @param id 用户id
	 * @return 用户对象
	 */
	UserBean getUserById(int id);
	
	/**
	 * 按多条件，完成分页查询
	 * @param params 查询条件
	 * @param pager 分页对象
	 * @return 包含数据的分页对象
	 */
	PageBean listUserPagerBeanByParams(Map params,PageBean page);
	
	/**
	 * 批量删除职员
	 * @param ids 职员ID数组
	 * @return 数据库受影响的行数
	 */
	int deleteBatchUser(Long[] ids);
}
