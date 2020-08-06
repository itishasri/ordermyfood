package com.omfsearchservice.dto;

import java.util.List;
import com.omfsearchservice.model.Restaurant;

public class RestaurantResponseDto {
	
	List<Restaurant> restaurants;
	int totalPages;
	long totalElements;
	public RestaurantResponseDto() {}
	
	public RestaurantResponseDto(List<Restaurant> restaurants, int totalPages, long totalElements) {
		super();
		this.restaurants = restaurants;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
	}
	public List<Restaurant> getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}	
}
