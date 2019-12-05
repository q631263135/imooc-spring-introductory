package com.imooc.injection;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

public class InjectionServiceImplTest extends UnitTestBase<InjectionService> {

    public InjectionServiceImplTest() {
        super("classpath*:spring-injection.xml");
    }

    @Test
    public void save() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save();
    }
}