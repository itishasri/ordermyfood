package com.omfsearchservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.omfsearchservice.dto.ItemRequestDto;
import com.omfsearchservice.exception.ItemNotFoundException;
import com.omfsearchservice.model.MenuItem;
import com.omfsearchservice.model.Restaurant;

public interface MenuItemService {
	
	MenuItem saveMenuItem(ItemRequestDto itemDto);
	List<Restaurant> findByName(String name, int pagenumber, int pagesize) throws  ItemNotFoundException ;
	Optional<MenuItem> findById(Long id);
	Page<MenuItem> findByMenuId(Long id , Pageable pageable);

}
