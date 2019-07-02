package com.hzw.spring.usermanage.mybatis.intercepter;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Statement;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/**
 * @Auther: huangzuwang
 * @Date: 2019-07-01 14:34
 * @Description:
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "query", args = { Statement.class, ResultHandler.class}) })
public class SQLInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        long startTime = System.currentTimeMillis();
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        String sql = boundSql.getSql();

        Map<String, Object> parameterMap = (Map<String, Object>) statementHandler.getParameterHandler().getParameterObject();
        System.out.println("获取到SQL语句："+sql);
        if (parameterMap != null && parameterMap.size() > 0){
            StringBuffer sb = new StringBuffer();
            sb.append("所有参数:");
            for (Map.Entry<String, Object> entry :  parameterMap.entrySet()){
                sb.append(String.format("%s -> %s", entry.getKey(), entry.getValue()));
                if ("First_PageHelper".equals(entry.getKey()) && Objects.equals(0, entry.getValue())){
                    continue;
                }
                sql =  sql.replaceFirst("\\?", entry.getValue().toString());
            }
            System.out.println(sb.toString());
        }
        System.out.println("执行的SQL语句："+sql);

        try {
            return invocation.proceed();
        }finally {
            long endTime = System.currentTimeMillis();
            System.out.println("SQL执行耗时：" + (endTime-startTime) +"ms");
        }

    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        String gupao = properties.getProperty("gupao");
        // System.out.println("获取到的参数："+ gupao);
    }
}
