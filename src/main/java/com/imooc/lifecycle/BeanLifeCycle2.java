package com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/5 13:28
 */
public class BeanLifeCycle2 implements InitializingBean, DisposableBean {

    public void destroy() {
        System.out.println("BeanLifeCycle2 destroy");
    }

    public void afterPropertiesSet() {
        System.out.println("BeanLifeCycle2 init");

    }
}
