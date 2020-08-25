package com.example.demo.lambdaTest;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 13:45
 * @description: 行转换结果
 */
@Data
public class RowConvertResult<T> {

    /**
     * 行转换结果
     */
    Map<String, DataConvertResult<T>> convertResultMap = new HashMap<>();

    /**
     * 获取整行数据的校验结果
     * @return
     */
    public String getReason(){
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, DataConvertResult<T>> entry : convertResultMap.entrySet()){
            DataConvertResult<T> dataConvertResult = entry.getValue();
            if (dataConvertResult != null){
                sb.append(dataConvertResult.getFailReason());
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
