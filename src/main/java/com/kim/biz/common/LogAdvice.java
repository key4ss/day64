package com.kim.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	
	@Before("PointcutCommon.aPointCut()")
	public void printLog(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		// 현재 수행중인 포인트컷(핵심로직)의 메서드명
		Object[] args = jp.getArgs();
		// 현재 수행중인 포인트컷(핵심로직, CRUD)이 사용하는 인자들의 정보
				
		//System.out.println(">>> 공통로직 <<<   핵심로직 수행전에 호출됨");
		System.out.println("수행중인 핵심메서드명: "+methodName);
		System.out.println("사용하는 인자: ");
		System.out.println("=====");
		for(Object v:args) {
			System.out.println(v);
		}
		System.out.println("=====");
	}
}
