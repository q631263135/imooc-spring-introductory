package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/9 13:16
 */
public class AwareBean1 implements ApplicationContextAware {

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("AwareBean1.hashCode():" + applicationContext.getBean("AwareBean1").hashCode());
    }
}
