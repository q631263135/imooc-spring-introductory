package com.imooc.aop.schema.advisors;

import lombok.Data;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.dao.PessimisticLockingFailureException;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2020/4/13 13:23
 */

@Data
public class ConcurrentOperationExcecutor {
    private static final int DEFAULT_MAX_RETRIES = 2;
    private int maxRetries = DEFAULT_MAX_RETRIES;
    private int order = 1;

    public Object doConcurrentOpration(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        PessimisticLockingFailureException lockingFailureException;
        do {
            try {
                return pjp.proceed();
            } catch (PessimisticLockingFailureException ex) {
                lockingFailureException = ex;
            }
            numAttempts ++;
        } while (numAttempts <= this.maxRetries);

        System.out.println("Try error: " + numAttempts);

        throw lockingFailureException;
    }
}
