package com.imooc.annotation.javabased;

import static org.junit.Assert.*;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

public class StringStoreTest extends UnitTestBase<Store> {

    public StringStoreTest() {
        super("classpath:annotation/javabased/spring-javabased-bean.xml");
    }

    @Test
    public void test() {
        Store stringStore = super.getBean("stringStore");
        System.out.println(stringStore.getClass().getName());
    }
}