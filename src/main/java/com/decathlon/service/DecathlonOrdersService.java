package com.decathlon.service;

import com.decathlon.pojo.Order;

public interface DecathlonOrdersService {

	Order createOrder(Order order);

	String updateOrder(String orderId,String orderStatus);
}
