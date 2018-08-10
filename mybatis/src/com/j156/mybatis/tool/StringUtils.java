package com.j156.mybatis.tool;

public class StringUtils {

	public static boolean isEmpty(String str) {
		if(str == null || "".equals(str)) return true;
		else return false;
	}
}
