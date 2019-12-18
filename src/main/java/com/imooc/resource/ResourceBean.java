package com.imooc.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class ResourceBean implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void infoConfig() throws IOException {
        Resource resource = applicationContext.getResource("classpath:config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.getURI());
    }
}
