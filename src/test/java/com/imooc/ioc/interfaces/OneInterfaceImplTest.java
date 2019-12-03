package com.imooc.ioc.interfaces;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class OneInterfaceImplTest extends UnitTestBase<OneInterface>{

    public OneInterfaceImplTest() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void sayHello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        oneInterface.sayHello();
    }
}