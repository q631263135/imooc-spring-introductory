package com.imooc.annotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2020/1/2 13:29
 */
@Configuration
public class Config {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Store stringStore() {
        return new StringStore();
    }
}
