package com.omfsearchservice.exception;

public class RestaurantBadRequestException extends RuntimeException {

	public  RestaurantBadRequestException() {
		super();
	}
	public RestaurantBadRequestException(String msg) {
		super(msg);
	}
}
