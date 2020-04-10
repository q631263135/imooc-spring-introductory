package com.imooc.aop.aspect.introductions;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2020/4/10 13:27
 */
public class FitImpl implements Fit {
    public void filter() {
        System.out.println("FitImpl.filter()");
    }
}
