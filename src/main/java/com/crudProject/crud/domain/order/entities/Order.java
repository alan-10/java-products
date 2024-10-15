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

	public Order() {
	}

	public Order(Long id, Instant moment, OrderStatus orderStatus, Integer productAmount, Long clientId,
			Long productId) {
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.productAmount = productAmount;
		this.productId =  productId;
		this.clientId = clientId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(Integer productAmount) {
		this.productAmount = productAmount;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", orderStatus=" + orderStatus + ", productAmount="
				+ productAmount + ", clientId=" + clientId + ", productId=" + productId + ", client=" + client
				+ ", product=" + product + "]";
	}

	
}
