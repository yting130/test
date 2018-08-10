package com.j156.mybatis.usermag.mapper;

import java.util.List;
import java.util.Map;

import com.j156.mybatis.bean.UserBean;
import com.j156.mybatis.tool.StringUtils;

public class UserMapperSqlProvider {

	/**
	 * 批量删除
	 * 
	 * @param params
	 * @return
	 */
	public String deleteBatchUser(Map<String, Object> params) {

		Long[] ids = (Long[]) params.get("ids");
		StringBuilder str = new StringBuilder();
		if (ids.length > 0) {
			str.append("delete from t_user where id in (");
			for (Long id : ids) {
				str.append("'" + id + "',");
			}
			int lenth = str.length();
			str.replace(lenth - 1, lenth, "");
			str.append(")");
		}
		return str.toString();
	}

	/**
	 * 修改用户
	 * 
	 * @param params
	 * @return
	 */
	public String updateUser(Map<String, Object> params) {

		UserBean emp = (UserBean) params.get("e");
		StringBuilder str = new StringBuilder();
		if (emp != null) {
			str.append("update t_employee set ");

			if (!StringUtils.isEmpty(emp.getUserName())) {
				str.append("employee_name = '" + emp.getUserName() + "',");
			}

			if (!StringUtils.isEmpty(emp.getUserPwd())) {
				str.append("job = '" + emp.getUserPwd() + "',");
			}

			int lenth = str.length();
			str.replace(lenth - 1, lenth, "");

			str.append(" where id = '" + emp.getId() + "'");
		}

		return str.toString();

	}

	/**
	 * 
	 * @param params
	 *            如果拼接SQL时需要带有参数， 才需要定义该Map<String,Object> params
	 * @return
	 */
	public String saveBatchUser(Map<String, Object> params) {
		List<UserBean> employees = (List<UserBean>) params.get("emps");
		StringBuilder str = new StringBuilder();

		if (employees != null && !employees.isEmpty()) {
			str.append("insert into t_user (user_name,user_pwd) values ");
			for (UserBean emp : employees) {
				str.append("('" + emp.getUserName() + "','" + emp.getUserPwd() + "'),");
			}
			int lenth = str.length();
			str.replace(lenth - 1, lenth, "");
		}
		return str.toString();
	}

}
