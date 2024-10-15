package com.crudProject.crud.domain.order.enuns;

public enum OrderStatus {
	WAITING_PAYMENT("WAITING_PAYMENT"), PAID("PAID"), SHIPPED("SHIPPED"), DELIVERD("DELIVERD"), CANCELED("DELIVERD");

	private String code;

	private OrderStatus(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public static OrderStatus getValueOf(String code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}

		throw new IllegalArgumentException("Invalid code");
	}
}
