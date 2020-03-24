package com.imooc.aop.schema.advice;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2020/3/17 13:39
 */
public class AspectBiz {
    public void biz() {
        System.out.println("AspectBiz.biz()...");
    }

    public void after() {
        System.out.println("AspectBiz.after()...");
    }

    public void afterReturning() {
        System.out.println("AspectBiz.afterReturning()...");
    }

    public void around(String s, int i) {
        System.out.println("AspectBiz.around()...");
    }
}
