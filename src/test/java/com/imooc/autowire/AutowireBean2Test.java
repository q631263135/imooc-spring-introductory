package com.imooc.autowire;

import static org.junit.Assert.*;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

public class AutowireBean2Test extends UnitTestBase<AutowireBean2> {

    public AutowireBean2Test() {
        super("classpath:spring-autowire.xml");
    }

    @Test
    public void test() {
        AutowireBean2 autowireBean2 = super.getBean("autowireBean2");
        autowireBean2.sayHello();
    }
}