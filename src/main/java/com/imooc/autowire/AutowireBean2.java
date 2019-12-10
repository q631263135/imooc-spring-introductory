package com.imooc.autowire;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/10 20:17
 */
public class AutowireBean2 {

    public void setAutowireBean1(AutowireBean1 autowireBean1) {
        this.autowireBean1 = autowireBean1;
    }

    private AutowireBean1 autowireBean1;

    public void sayHello() {
        System.out.println("AutowireBean2 say hello.");
        autowireBean1.sayHello();
    }
}
