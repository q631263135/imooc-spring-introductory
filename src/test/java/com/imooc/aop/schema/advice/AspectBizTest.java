package com.imooc.aop.schema.advice;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class AspectBizTest extends UnitTestBase<AspectBiz> {

    public AspectBizTest() {
        super("classpath:aop/schema/advice/spring-aspect.xml");
    }

    @Test
    public void test() {
        AspectBiz aspectBiz = super.getBean("aspectBiz");
        aspectBiz.biz();
    }
}