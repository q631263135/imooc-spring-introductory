package com.imooc.resource;

import com.imooc.junit.UnitTestBase;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ResourceBeanTest extends UnitTestBase<ResourceBean> {
    public ResourceBeanTest() {
        super("classpath*:spring-resource.xml");
    }

    @Test
    public void infoConfig() throws IOException {
        ResourceBean resourceBean = super.getBean("resourceBean");
        resourceBean.infoConfig();
    }
}