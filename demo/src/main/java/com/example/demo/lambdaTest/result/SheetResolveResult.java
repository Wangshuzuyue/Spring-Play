package com.example.demo.lambdaTest.result;

import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: huangzuwang
 * @date: 2020-04-29 13:45
 * @description:
 */
@Data
public class SheetResolveResult<E> {

    /**
     * 转换成功的数据列表
     */
    List<RowConvertResult<E>> successResults;

    /**
     * 转换失败结果列表
     */
    List<RowConvertResult<E>> failResults;

    /**
     * 获取成功的数据列表
     * @return
     */
    public List<E> getSuccessList(){
        if (CollectionUtils.isEmpty(successResults)){
            return new ArrayList<>();
        }
        return successResults.stream().map(RowConvertResult::getEntity).collect(Collectors.toList());
    }

    /**
     * 获取失败的数据列表
     * @return
     */
    public List<E> getFailList(){
        if (CollectionUtils.isEmpty(failResults)){
            return new ArrayList<>();
        }
        return failResults.stream().map(RowConvertResult::getEntity).collect(Collectors.toList());
    }

    /**
     * 获取全量的数据列表
     * @return
     */
    public List<E> getALLData(){
        List<E> list = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(successResults)){
            list.addAll(successResults.stream().map(RowConvertResult::getEntity).collect(Collectors.toList()));
        }
        if (CollectionUtils.isNotEmpty(failResults)){
            list.addAll(failResults.stream().map(RowConvertResult::getEntity).collect(Collectors.toList()));
        }
        return list;
    }


//    public void toFail(RowConvertResult<E> rowConvertResult){
//        failResults.add(rowConvertResult);
//        successResults.remove(successResults.indexOf(rowConvertResult));
//    }

//    public void toSuccess(RowConvertResult<E> rowConvertResult){
//        successResults.add(rowConvertResult);
//        int index = failResults.indexOf(rowConvertResult);
//
//        failResults.remove(failResults.indexOf(rowConvertResult));
//    }
}
