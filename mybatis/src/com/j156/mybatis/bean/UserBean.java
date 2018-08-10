package com.j156.mybatis.bean;

import java.io.Serializable;
import java.util.List;

/***
 * 用户实体类
 * 
 * @author yt
 *
 */
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6912613033671054861L;
	/** 用户id **/
	private int id;
	/** 用户姓名 **/
	private String userName;
	/** 用户订单集合 **/
	private List<IndentBean> indent;
	/** 用户密码 **/
	private String userPwd;

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public List<IndentBean> getIndent() {
		return indent;
	}

	public void setIndent(List<IndentBean> indent) {
		this.indent = indent;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + "]";
	}

	public UserBean(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}

}
