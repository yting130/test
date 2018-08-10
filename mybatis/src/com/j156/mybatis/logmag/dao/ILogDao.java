package com.j156.mybatis.logmag.dao;

import com.j156.mybatis.aspect.OperateLogAspect;

public interface ILogDao {
	void savaOperateLog(OperateLogAspect bean);
}
