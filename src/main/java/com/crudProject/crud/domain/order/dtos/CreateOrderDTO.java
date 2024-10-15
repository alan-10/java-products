package com.crudProject.crud.domain.order.dtos;

import java.time.Instant;

public class CreateOrderDTO  {
	private Instant moment;
	private String orderStatus;
	private Integer productAmount;
	private Long product_id;
	private Long client_id;
}
