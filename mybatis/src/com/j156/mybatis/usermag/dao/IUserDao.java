package com.j156.mybatis.usermag.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.j156.mybatis.bean.UserBean;

/**
 * 用户持久类
 * @author yt
 *
 */
public interface IUserDao {
	/**
	 * 新增用户
	 * @param user 用户数据
	 * @return 数据库受影响的行数
	 */
	int saveUser(UserBean user);
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
	 * @return 数据库受影响的行数
	 */
	UserBean getUserById(int id);
	
	/**
	 * 分页统计方法
	 * 
	 * @param params
	 *            查询条件
	 * @return 统计的条数
	 */
	int countUserByParams(@Param("params") Map params);

	/**
	 * 分页查询方法
	 * 
	 * @param params
	 *            查询条件
	 * @return 查询后返回的数据
	 */
	List<UserBean> listUserByParams(@Param("params") Map params);
	
	/**
	 * 批量删除职员
	 * @param ids 职员ID数组
	 * @return 数据库受影响的行数
	 */
	int deleteBatchUser(Long[] ids);
	/**
	 * 批量新增职员
	 * @param ids 职员ID数组
	 * @return 数据库受影响的行数
	 */
	int saveBatchUser(List<UserBean> user);
}
