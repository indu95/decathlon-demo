package com.decathlon.dao;

import com.decathlon.pojo.Order;

public interface OrdersDao {

	Order saveOrder(Order order);

	Order findOrder(String orderid);
	
	Order updateOrder(Order order);
}
