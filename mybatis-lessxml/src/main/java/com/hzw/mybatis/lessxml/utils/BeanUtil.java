package com.hzw.mybatis.lessxml.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;
import java.util.Collection;

/**
 * @author: huangzuwang
 * @date: 2019-09-18 17:12
 * @description:
 */
public class BeanUtil {

    /**
     * 实体类 string 类型字段 去空格
     * @param object
     * @param affectSuper 是否作用于父类字段
     * @param <T>
     */
    public static <T> void trim(T object, boolean affectSuper){
        if (object == null) {
            return;
        }
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getMethods();
        if (methods.length <= 0) {
            return;
        }
        for (Method method : methods) {
            if (Object.class == method.getDeclaringClass()){
                continue;
            }
            if (clazz != method.getDeclaringClass() && !affectSuper){
                continue;
            }
            String methodName = method.getName();
            if (!StringUtils.startsWith(methodName, "get")) {
                continue;
            }
            if (String.class != method.getReturnType()) {
                continue;
            }
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            try {
                String value = (String) method.invoke(object);
                String fieldName = methodName.substring(3);
                Method setMethod = clazz.getMethod("set" + fieldName, String.class);
                if (setMethod != null){
                    setMethod.invoke(object, StringUtils.trim(value));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 实体类 string 类型字段 去空格
     *
     * @param object
     * @param <T>
     */
    public static <T> void trim(T object) {
        trim(object, true);
    }

    /**
     * 实体类集合 string 类型字段 去空格
     *
     * @param collection
     * @param <T>
     */
    public static <T> void trim(Collection<T> collection) {
        trim(collection, true);
    }

    /**
     *
     * @param collection
     * @param affectSuper 是否作用于父类字段
     * @param <T>
     */
    public static <T> void trim(Collection<T> collection, boolean affectSuper) {
        if (CollectionUtils.isEmpty(collection)) {
            return;
        }
        for (Object o : collection) {
            trim(o, affectSuper);
        }
    }
}
