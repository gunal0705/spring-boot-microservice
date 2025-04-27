package com.order.service.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_order",catalog = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String OrderNumber;
	private String skuCode;
	private BigDecimal price;
	private Integer quantiy;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getQuantiy() {
		return quantiy;
	}
	public void setQuantiy(Integer quantiy) {
		this.quantiy = quantiy;
	}
	
	
}
