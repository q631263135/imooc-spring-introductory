package com.imooc.aop.schema.advisors.service;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvokeServiceTest extends UnitTestBase<InvokeService> {

    public InvokeServiceTest() {

        super("classpath:aop/schema/advisors/spring-aop-advisors.xml");
    }

    @Test
    public void invoke() {
        InvokeService invokeService = super.getBean("invokeService");
        invokeService.invoke();

    }

    @Test
    public void invokeException() {
        InvokeService invokeService = super.getBean("invokeService");
        invokeService.invokeException();
    }
}