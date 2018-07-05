/*
 * Copyright (C), 2013-2018, 上汽集团
 * FileName: OrderServiceImpl.java
 * Author:   raolesong
 * Date:     2018年7月5日 下午2:42:03
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.soft.ebiz.order.service.impl;
import java.util.List;

import com.soft.ebiz.order.service.api.IOrderService;
import com.soft.ebiz.order.service.vo.OrderVo;

/**
 * 〈功能详细描述〉
 * @author raolesong
 * 2018年7月5日 下午2:42:03
 */
public class OrderServiceImpl implements IOrderService {

	public OrderServiceImpl(){
		System.out.println("OrderServiceImpl+++++");
	}
	
	public int addOrder() {
		return 0;
	}

	public List<OrderVo> getOrderList(int userId) {
		return null;
	}

}
