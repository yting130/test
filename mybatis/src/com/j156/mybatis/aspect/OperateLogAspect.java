package com.j156.mybatis.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 操作日志切面
 * @author 00
 *
 */
@Aspect
@Component
public class OperateLogAspect {
	@Pointcut("")
	
	
	
	
	
	@AfterReturning(pointcut="ponintcut() && @annotation(myLog)")
	public void afterReturning() {
		
	}

}
