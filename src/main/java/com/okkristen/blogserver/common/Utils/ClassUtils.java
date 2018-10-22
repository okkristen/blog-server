package com.okkristen.blogserver.common.Utils;

public class ClassUtils {

    public <T> T getSourceClass(Class<T> tClass) {
        try {
            return tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }

    // 根据 Service 拿到两个泛型
    
}
