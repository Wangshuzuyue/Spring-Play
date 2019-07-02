package com.hzw.spring.usermanage.provider.protocol;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: huangzuwang
 * @Date: 2019/6/16 20:22
 * @Description:
 */
@Data
public class InvokerProtocol implements Serializable{

    /**
     * 类名
     */
    private String className;

    /**
     * 方法名
     */
    private String methodName;

    /**
     * 形参列表
     */
    private Class<?> [] prames;

    /**
     * 实参列表
     */
    private Object[] values;
}
