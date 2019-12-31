package com.imooc.annotation.multibean;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/31 13:16
 */
@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    public void say() {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                BeanInterface beanInterface = list.get(i);
                System.out.println(beanInterface.getClass().getName());
            }
        } else {
            System.out.println("list is null");
        }
    }
}
