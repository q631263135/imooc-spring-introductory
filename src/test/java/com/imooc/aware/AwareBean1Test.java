package com.imooc.aware;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

public class AwareBean1Test extends UnitTestBase<AwareBean1> {

    public AwareBean1Test() {
        super("classpath*:spring-aware.xml");
    }

    @Test
    public void test() {
        System.out.println(super.getBean("AwareBean1").hashCode());
    }

}