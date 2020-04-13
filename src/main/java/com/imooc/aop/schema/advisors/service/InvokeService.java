package com.imooc.aop.schema.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2020/4/13 13:40
 */
@Service
public class InvokeService {

    public void invoke() {
        System.out.println("InvokeService.invoke()...");
    }

    public void invokeException() {
        throw new PessimisticLockingFailureException("");
    }
}
