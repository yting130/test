package com.j156.mybatis.aspect;

import java.lang.reflect.Field;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.j156.mybatis.tool.MyBatisUtil;

/**
 * 操作dao切面
 * 
 * @author yt
 *
 */
@Aspect
@Component
public class TransactionAspect {
	private SqlSession session;

	/**
	 * 前置通知 该通知执行在目标对象的目标方法执行之前 目标对象 在切面上，实际上是代理对象 jp 连接点
	 */
	@Before(value = "execution(* com.j156.mybatis.*mag.dao.impl.*.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		Object target = jp.getTarget();
		Class<?> cls = target.getClass();
		try {
			// 得到属性
			Field field = cls.getDeclaredField("session");
			field.setAccessible(true);// 授权操作私有属性
			// 设置属性值
			session = MyBatisUtil.getSqlSession();
			field.set(target, session);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("前置通知----设置session");

	}

	/**
	 * 后置返回通知 该通知执行在目标方法正常执行成功之后
	 * 
	 * @param jp
	 *            连接点
	 * @param rev
	 *            目标方法的返回结果
	 */
	@AfterReturning(pointcut = "execution(* com.j156.mybatis.*mag.dao.impl.*.*(..))", returning = "rev")
	public void afterReturningAdvice(JoinPoint jp, Object rev) {
		//成功后提交
		session.commit();
	}

	/**
	 * 后置异常通知 该通知执行在目标方法抛出异常之后
	 * 
	 * @param jp
	 *            连接点
	 * @param e
	 *            目标方法抛出的异常对象
	 */
	@AfterThrowing(pointcut = "execution(* com.j156.mybatis.*mag.dao.impl.*.*(..))", throwing = "e")
	public void afterThrowingAdvice(JoinPoint jp, Exception e) {
		//异常后回滚
		session.rollback();
		System.out.println(e);
	}
}
