package com.omforderservice.dto;

public class OrderedItemsDto {
	
	private long itemId;
	private int quantity;

	public OrderedItemsDto() {}
	public OrderedItemsDto(long itemId, int quantity) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
