package com.j156.mybatis.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.j156.mybatis.bean.UserBean;

public interface UserMapper {
	/**
	 * 批量新增职员
	 * 
	 * @param employees
	 *            职员数据
	 * @return 数据库受影响的行数
	 */
	@InsertProvider(type = UserMapperSqlProvider.class, method = "saveBatchUser")
	int saveBatchEmployee(@Param("emps") List<UserBean> employees);

	/**
	 * 新增用户
	 * 
	 * @param user
	 *            用户数据
	 * @return 数据库受影响的行数
	 */
	@Insert("insert into t_user (user_name,user_pwd) values(#{u.userName},#{u.userPwd});")
	int saveUser(@Param("u") UserBean user);

	/**
	 * 修改用户
	 * 
	 * @param user
	 *            用户数据
	 * @return 数据库受影响的行数
	 */
	@UpdateProvider(type = UserMapperSqlProvider.class, method = "updateUser")
	int updateUser(@Param("e") UserBean user);

	/**
	 * 删除用户
	 * 
	 * @param user
	 *            用户数据
	 * @return 数据库受影响的行数
	 */
	@Delete("delete from t_user where id = #{u.id}")
	int deleteUser(@Param("u") UserBean user);

	/**
	 * 查找用户
	 * 
	 * @param id
	 *            用户id
	 * @return 用户实体类
	 */
	@Select("select u.id as id,u.user_name ,u.user_pwd ,i.id as indent_id,i.indent_name,i.indent_date,i.indent_price from t_user u join t_indent i on u.id = i.fk_user_id where u.id = #{id}")
	@ResultMap("UserMap")
	UserBean getUserById(@Param("id") int id);

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
	 * 
	 * @param ids
	 *            职员ID数组
	 * @return 数据库受影响的行数
	 */

	@DeleteProvider(type = UserMapperSqlProvider.class, method = "deleteBatchUser")
	int deleteBatchUser(@Param("ids") Long[] ids);
}
