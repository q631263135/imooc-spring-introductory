package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/9 13:18
 */
public class AwareBean3 implements ApplicationContextAware, BeanNameAware {

    private int value = 123;

    private String beanName;

    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AwareBean3 bean = (AwareBean3) applicationContext.getBean(beanName);
        System.out.println("AwareBean3.getValue():" + bean.getValue());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
