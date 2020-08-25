package com.yunxin.common.page;

import lombok.Data;

/**
 * @description: 分页入参
 * @author: huangzuwang
 * @date: 2019-12-07 20:17
 **/
@Data
public class OffsetReq {

	/**
     * 数据偏移量
	 */
	private int offset = 0;

    /**
     * 查询条数
	 */
	private int count = 10;

}
