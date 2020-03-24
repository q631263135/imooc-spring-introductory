package com.imooc.aop.schema.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2020/3/17 13:38
 */
public class MyAspect {
    public void before() {
        System.out.println("MyAspect.before()...");
    }

    public void after() throws Throwable {
        System.out.println("MyAspect.after()...");

    }

    public void afterReturning() throws Throwable {
        System.out.println("MyAspect.afterReturning()...");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("MyAspect.around()... start");
        joinPoint.proceed();
        System.out.println("MyAspect.around()... end");
    }
}
