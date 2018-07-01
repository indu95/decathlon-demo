package com.decathlon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decathlon.dao.OrdersDao;
import com.decathlon.pojo.Order;

@Service("orderService")
public class DecathlonServiceImpl implements DecathlonOrdersService {
	@Autowired
	private OrdersDao ordersDao;

	@Override
	public Order createOrder(Order order) {
		if (order.getModeOfBuying().equalsIgnoreCase("STORE")) {
			order.setOrderState("shipped");
		} else if (order.getModeOfBuying().equalsIgnoreCase("ONLINE")) {
			order.setOrderState("PreparedForShipping");
		}

		return ordersDao.saveOrder(order);
	}

	@Override
	public String updateOrder(String orderId, String orderStatus) {
		String msg = null;
		if (orderId == null) {
			msg = "orderId cannot be null.Please provide the orderId";
			return msg;
		} else if (orderStatus == null) {
			msg = "orderStatus cannot be null.Please provide the orderstatus";
			return msg;
		}

		Order orderDb = ordersDao.findOrder(orderId);
		if (orderDb.getOrderId() == null) {
			msg = "Invalid orderId or orderId does not exist!! Please enter a valid one";
		} else {
			if (orderDb.getModeOfBuying().equalsIgnoreCase("ONLINE")) {
				if (orderStatus.equalsIgnoreCase("Shipped")) {
					if (orderDb.getOrderState().equalsIgnoreCase("PreparedForShipping")) {
						orderDb.setOrderState("shipped");
						ordersDao.updateOrder(orderDb);
						msg = "order status changed to shipped!";
					} else if (orderDb.getOrderState().equalsIgnoreCase("cancelled")) {
						msg = "order id-" + orderId + "-is cancelled so status cannot be changed to shipped";
					} else if (orderDb.getOrderState().equalsIgnoreCase("shipped")) {
						msg = "order status is already shipped!!";
					}
				} else if (orderStatus.equalsIgnoreCase("Cancelled")) {
					if (orderDb.getOrderState().equalsIgnoreCase("PreparedForShipping")) {
						orderDb.setOrderState("Cancelled");
						ordersDao.updateOrder(orderDb);
						msg = "order status updated to cancelled";
					} else if (orderDb.getOrderState().equalsIgnoreCase("shipped")) {
						msg = "order id-" + orderId + "-is already shipped so order cannot be cancelled";
					} else if (orderDb.getOrderState().equalsIgnoreCase("Cancelled")) {
						msg = "order status is already cancelled!!";
					}
				} else {
					msg = "invalid order status.Allowed order status are- shipped and cancelled!!!";
				}
			} else {
				msg = "Order status can only be changed  if mode of buying is online!!";
			}
		}
		return msg;
	}
}
