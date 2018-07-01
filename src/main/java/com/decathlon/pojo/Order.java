package com.decathlon.pojo;

public class Order {
	private String orderId;
	private String orderDate;
	private String customerName;
	private String modeOfBuying;
	private String orderState;

	public String getOrderId() {
		return orderId;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
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
