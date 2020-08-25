package com.hzw.springboot.jdbc.repository;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: huangzuwang
 * @date: 2019-11-26 19:04
 * @description:
 */
public interface TKMapper<T> extends Mapper<T>, MySqlMapper<T> {

}

