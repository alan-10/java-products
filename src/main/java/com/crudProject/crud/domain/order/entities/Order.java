package com.crudProject.crud.domain.order.entities;

import java.io.Serializable;
import java.time.Instant;

import com.crudProject.crud.domain.order.enuns.OrderStatus;
import com.crudProject.crud.domain.product.entities.Product;
import com.crudProject.crud.domain.user.entities.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;

	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

	Integer productAmount;

	@Column(name = "client_id", nullable = false)
	Long clientId;
	
	@Column(name = "product_id", nullable = false)
	Long productId;
	
	

	@ManyToOne
	@JoinColumn(name = "client_id", insertable = false, updatable = false)
	private User client;

	@ManyToOne
	@JoinColumn(name = "product_id", insertable = false, updatable = false)
	private Product product;

}
