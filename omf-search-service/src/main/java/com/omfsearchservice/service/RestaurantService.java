package com.omfsearchservice.service;

import java.util.List;

import com.omfsearchservice.dto.RestaurantRequestDto;
import com.omfsearchservice.dto.RestaurantResponseDto;
import com.omfsearchservice.model.MenuItem;
import com.omfsearchservice.model.Restaurant;

public interface RestaurantService {
	
	RestaurantResponseDto findAllRestaurants(int pageNumber, int pageSize);
	Restaurant saveRestaurant(RestaurantRequestDto restaurant);
	
	RestaurantResponseDto findByName(String name, int pageNumber, int pageSize);
	RestaurantResponseDto findByLocationAndCuisine(String location, String cuisine, int pageNumber, int pageSize);
	RestaurantResponseDto findByBudget(int budget, int pageNumber, int pageSize);
	RestaurantResponseDto findByLocationAndName(String location, String name, int pageNumber, int pageSize);
	RestaurantResponseDto findByRating(double rating,int pageNumber, int pageSize);
	Restaurant findById(Long id)  ;
	List<MenuItem> findMenuItemByRestaurantId(Long restaurantId, int pageNumber, int pageSize);

}
