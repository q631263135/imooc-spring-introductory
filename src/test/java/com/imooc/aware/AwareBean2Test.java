package com.imooc.aware;

import static org.junit.Assert.*;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

public class AwareBean2Test extends UnitTestBase<AwareBean2> {

    public AwareBean2Test() {
        super("classpath*:spring-aware.xml");

    }

    @Test
    public void test() {

    }
}
