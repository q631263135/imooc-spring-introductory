package com.imooc.aop.aspect.introductions;

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
}
