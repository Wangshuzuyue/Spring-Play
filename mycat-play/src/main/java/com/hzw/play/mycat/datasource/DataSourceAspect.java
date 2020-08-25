package com.hzw.play.mycat.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author: huangzuwang
 * @date: 2019-10-20 22:53
 * @description:
 */
@Aspect
@Component
@Slf4j
public class DataSourceAspect implements Ordered {

    @Pointcut("@annotation(com.hzw.play.mycat.datasource.TargetDataSource)")
    public void dateSourcePointCut(){
    }

    @Around("dateSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();
        TargetDataSource anno = method.getAnnotation(TargetDataSource.class);
        if (anno == null){
            DynamicDataSource.setDataSource(DynamicDataSourceConfig.FIRST_NAME);
        }else{
            DynamicDataSource.setDataSource(anno.name());
        }
        log.info(String.format(">>>> 设置默认数据源[%s]", DynamicDataSource.getDataSource()));

        try {
            return point.proceed();
        }finally {
            DynamicDataSource.clearDataSource();
            log.info(">>>> clear datasource");
        }
    }


    @Override
    public int getOrder() {
        return 0;
    }
}
