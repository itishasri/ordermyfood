package com.omforderservice.dto;

import java.util.List;


public class OrderRequestDto {
	
	private Long customerId;
	private Long restaurantId;
	private List<OrderedItemsDto> items;
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
	
}
