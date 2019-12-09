package com.imooc.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/9 13:18
 */
public class AwareBean2 implements BeanNameAware, InitializingBean {

    public void setBeanName(String name) {
        System.out.println("AwareBean2.setBeanName():" + name);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("AwareBean2.afterPropertiesSet()");
    }
}
