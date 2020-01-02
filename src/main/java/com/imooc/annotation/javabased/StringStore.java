package com.imooc.annotation.javabased;

import org.springframework.stereotype.Component;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2020/1/2 13:25
 */
public class StringStore implements Store {

    public void init() {
        System.out.println("init()...");
    }

    public void destroy() {
        System.out.println("destroy()...");
    }
}
