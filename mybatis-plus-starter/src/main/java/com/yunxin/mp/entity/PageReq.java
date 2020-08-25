package com.yunxin.common.page;

import lombok.Data;

/**
 * @description: 分页入参
 * @author: huangzuwang
 * @date: 2019-12-06 17:17
 **/
@Data
public class PageReq {

	/**
	 * 当前页
	 */
	private int pageNum = 1;

	/**
	 * 每页数据条数
	 */
	private int pageSize = 10;

}
