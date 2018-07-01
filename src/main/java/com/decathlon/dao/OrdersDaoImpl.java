package com.decathlon.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decathlon.entity.OrderEntity;
import com.decathlon.pojo.Order;
import com.decathlon.repository.OrdersRepository;

@Service("ordersRepositoryDao")
public class OrdersDaoImpl implements OrdersDao {

	@Autowired
	private OrdersRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {
		OrderEntity orderEntity = new OrderEntity();
		order.setOrderId(orderEntity.getOrderId());
		BeanUtils.copyProperties(order, orderEntity);
		orderRepository.save(orderEntity);
		return order;
	}

	@Override
	public Order findOrder(String orderid) {

		Order order = new Order();
		OrderEntity orderEntity = orderRepository.findOne(orderid);
		if (orderEntity != null) {
			BeanUtils.copyProperties(orderEntity, order);
		}
		return order;
	}

	@Override
	public Order updateOrder(Order order) {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setOrderId(order.getOrderId());
		BeanUtils.copyProperties(order, orderEntity);
		orderRepository.save(orderEntity);
		return order;
	}

}
