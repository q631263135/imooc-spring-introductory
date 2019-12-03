package com.imooc.junit;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/11/27 13:19
 */
public class UnitTestBase<T> {

    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }

        context = new ClassPathXmlApplicationContext(springXmlPath);
        context.start();
    }

    @After
    public void after() {
        context.close();
    }

    public T getBean(String beanName) {
        return (T) context.getBean(beanName);
    }
}
