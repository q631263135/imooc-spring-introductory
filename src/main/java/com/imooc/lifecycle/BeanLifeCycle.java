package com.imooc.lifecycle;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/5 13:28
 */
public class BeanLifeCycle {

    public void start() {
        System.out.println("BeanLifeCycle init");

    }

    public void stop() {
        System.out.println("BeanLifeCycle destroy");
    }

}
