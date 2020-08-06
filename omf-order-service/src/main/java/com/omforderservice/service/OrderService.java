package com.omforderservice.service;

import java.util.Optional;

import com.omforderservice.dto.OrderRequestDto;
import com.omforderservice.dto.OrderUpdateDto;
import com.omforderservice.dto.OrderUpdateResponseDto;
import com.omforderservice.exception.OrderException;
import com.omforderservice.model.Order;

public interface OrderService  {
	
	Order placeOrder(OrderRequestDto orderRequest) throws OrderException;
	boolean cancelOrder(Long orderId);
	Optional<Order> getOrderById(Long id);
	double getOrderAmountByOrderId(Long id);
	OrderUpdateResponseDto updateOrder(OrderUpdateDto orderUpdateRequest) throws OrderException;

}
