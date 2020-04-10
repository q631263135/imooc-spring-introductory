package com.imooc.aop.aspect.introductions;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;


public class AspectBizTest extends UnitTestBase<AspectBiz> {
    public AspectBizTest() {
        super("classpath:aop/introductions/spring-aspect-introductions.xml");
    }

    @Test
    public void testFit() {
        AspectBiz aspectBiz = super.getBean("aspectBiz"); // 被通知的对象
        aspectBiz.biz(); // System.out.println("AspectBiz.biz()...");

        Fit fit = (Fit) aspectBiz;
        fit.filter(); // System.out.println("FitImpl.filter()");
    }
}