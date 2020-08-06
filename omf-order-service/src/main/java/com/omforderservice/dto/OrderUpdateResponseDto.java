package com.omforderservice.dto;

import java.util.List;

import com.omforderservice.model.OrderedItem;

public class OrderUpdateResponseDto  {

	
	private Long orderId;
	private Long customerId;
	private String status;
	private Long restaurantId;
	private List<OrderedItem> orderedItems;

	public OrderUpdateResponseDto() {}
	public OrderUpdateResponseDto(Long orderId, Long customerId, String status, Long restaurantId,
			List<OrderedItem> orderedItems) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.status = status;
		this.restaurantId = restaurantId;
		this.orderedItems = orderedItems;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public List<OrderedItem> getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(List<OrderedItem> orderedItems) {
		this.orderedItems = orderedItems;
	}
	
}
