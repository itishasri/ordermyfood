package com.omforderservice.dto;

import java.util.List;

public class OrderUpdateDto {
	
	private Long customerId;
	private Long restaurantId;
	private List<OrderedItemsDto> items;
	private Long orderId;
	
	public OrderUpdateDto() {}
	
	public OrderUpdateDto(Long customerId, Long restaurantId, List<OrderedItemsDto> items, Long orderId) {
		super();
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.items = items;
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public List<OrderedItemsDto> getItems() {
		return items;
	}

	public void setItems(List<OrderedItemsDto> items) {
		this.items = items;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
}
