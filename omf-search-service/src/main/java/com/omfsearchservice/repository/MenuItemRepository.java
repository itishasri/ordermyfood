package com.omfsearchservice.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.omfsearchservice.model.MenuItem;


public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
	
	Page<MenuItem> findByNameContaining(String name, Pageable pageable);
	
	Optional<MenuItem> findById(Long id);
	Page<MenuItem> findByMenu_id(Long id, Pageable pageable);

}
