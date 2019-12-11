package com.imooc.autowire;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import org.junit.experimental.theories.DataPoint;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/10 20:17
 */
public class AutowireBean4 {

    @lombok.Setter
    private AutowireBean3 autowireBean;

    public void sayHello() {
        System.out.println("AutowireBean4 say hello.");
        autowireBean.sayHello();
    }
}
