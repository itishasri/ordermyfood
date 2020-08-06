package com.omfsearchservice.service;

import java.util.Optional;

import com.omfsearchservice.model.Menu;

public interface MenuService {
	
	Menu saveMenu(Menu menu);
	Optional<Menu> getMenuById(Long id);
	Menu getMenuByRestaurantId(Long id);

}
