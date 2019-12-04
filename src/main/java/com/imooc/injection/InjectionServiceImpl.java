package com.imooc.injection;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/12/4 13:16
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    public void save() {
        injectionDao.save();
    }

    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }
}
