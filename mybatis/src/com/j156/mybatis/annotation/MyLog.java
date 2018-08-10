package com.j156.mybatis.annotation;

import com.j156.mybatis.enmu.OperateLogEnum;

public @interface MyLog {

	/**
	 * 操作人
	 * 
	 * @return
	 */
	String menuName() default "";

	/**
	 * 操作类型
	 */
	OperateLogEnum getType();

}
