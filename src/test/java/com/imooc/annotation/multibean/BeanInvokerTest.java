package com.imooc.annotation.multibean;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;


public class BeanInvokerTest extends UnitTestBase<BeanInvoker>{

    public BeanInvokerTest() {
        super("classpath:annotation/multibean/spring-autowired-multibean.xml");
    }

    @Test
    public void testAutowired() {
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
}