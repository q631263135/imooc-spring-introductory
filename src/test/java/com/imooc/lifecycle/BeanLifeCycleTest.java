package com.imooc.lifecycle;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

public class BeanLifeCycleTest extends UnitTestBase<BeanLifeCycle> {


    public BeanLifeCycleTest() {
        super("classpath*:spring-lifecycle.xml");
    }

    @Test
    public void test() {
        super.getBean("beanLifeCycle");
    }
}