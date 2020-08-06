package com.omforderservice.service;

import java.util.List;

import com.omforderservice.model.OrderedItem;

public interface ItemService {
	
	public OrderedItem saveItem(OrderedItem item);
	public List<OrderedItem> findbyOrderId(Long id);
	public void deleteItemsById(Long id);

}
