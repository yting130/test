package com.j156.mybatis.logmag.dao.impl;

import com.j156.mybatis.aspect.OperateLogAspect;
import com.j156.mybatis.logmag.dao.ILogDao;

public class LogDaoImpl implements ILogDao {

	@Override
	public void savaOperateLog(OperateLogAspect bean) {
		System.out.println(bean);
		
	}

}
