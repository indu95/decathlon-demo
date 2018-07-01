package com.decathlon.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class OrderEntity {
	@Id
	private String orderId;
	private String orderDate;
	private String customerName;
	private String modeOfBuying;
	private String orderState;

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public OrderEntity() {
		this.orderId = UUID.randomUUID().toString();
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getModeOfBuying() {
		return modeOfBuying;
	}

	public void setModeOfBuying(String modeOfBuying) {
		this.modeOfBuying = modeOfBuying;
	}

}
