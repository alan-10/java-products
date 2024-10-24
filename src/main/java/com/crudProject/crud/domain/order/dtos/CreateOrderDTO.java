package com.crudProject.crud.domain.order.dtos;

import java.time.Instant;

import com.crudProject.crud.domain.order.enuns.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateOrderDTO {
	private Instant moment;
	private OrderStatus orderStatus;
	private Integer productAmount;
	private Long productId;
	private Long clientId;
}
