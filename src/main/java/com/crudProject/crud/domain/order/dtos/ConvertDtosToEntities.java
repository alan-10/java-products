package com.crudProject.crud.domain.order.dtos;

import com.crudProject.crud.domain.order.entities.Order;

public class ConvertDtosToEntities {

	public static Order orderEntity(CreateOrderDTO orderDTO) {
		return new Order(null, orderDTO.getMoment(), orderDTO.getOrderStatus(), orderDTO.getProductAmount(),
				orderDTO.getClientId(), orderDTO.getProductId());
	}

}
