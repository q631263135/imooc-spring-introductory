package com.imooc.autowire;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

public class AutowireBean4Test extends UnitTestBase<AutowireBean4> {

    public AutowireBean4Test() {
        super("classpath:spring-autowire.xml");
    }

    @Test
    public void test() {
        AutowireBean4 autowireBean4 = super.getBean(AutowireBean4.class);
        autowireBean4.sayHello();
    }
}