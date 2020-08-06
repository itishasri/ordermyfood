package com.omfuserservice.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.omfuserservice.dto.CustomerDto;
import com.omfuserservice.exception.CustomerNotFoundException;
import com.omfuserservice.model.Customer;
import com.omfuserservice.repository.CustomerRepository;
import com.omfuserservice.service.CustomerServiceImpl;

@RunWith(SpringRunner.class)
public class CustomerServiceTest {

	@InjectMocks CustomerServiceImpl customerService;
	
	@Mock CustomerRepository customerRepository;

	Customer customer;

	CustomerDto customerDto;

	@Before
	public void createStubs() {
		customer = new Customer(1, "Itisha", "Srivastava", "itisha", "itisha");
		customerDto = new CustomerDto(customer);
	}

	@Test
	public void findById() {
		when(customerRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(customer));
		Customer customer = customerService.getCustomer(1);
		assertEquals("itisha", customer.getUsername());
	}

	@Test(expected = CustomerNotFoundException.class)
	public void findById_NotFound() {
		when(customerRepository.findById(Mockito.anyInt())).thenReturn(Optional.empty());

		customerService.getCustomer(100);
	}

	@Test
	public void registerCustomer() {
		when(customerRepository.save(any(Customer.class))).thenReturn(customer);
		Customer customerTest = customerService.registerCustomer(customerDto);
		assertEquals("vitthal", customerTest.getUsername());
	}

	@Test
	public void updateCustomer_found() {
		when(customerRepository.findByIdAndIsActiveIsTrue(Mockito.anyInt())).thenReturn(customer);
		boolean updatedStatus = customerService.updateCustomer(customerDto, 1);
		assertEquals(true, updatedStatus);
	}

	@Test
	public void updateCustomer_NotFound() {
		when(customerRepository.findByIdAndIsActiveIsTrue(Mockito.anyInt())).thenReturn(null);
		boolean updatedStatus = customerService.updateCustomer(customerDto, 200);
		assertEquals(false, updatedStatus);
	}

	@Test
	public void deactivateCustomer_found() {
		when(customerRepository.findByIdAndIsActiveIsTrue(Mockito.anyInt())).thenReturn(customer);
		boolean updatedStatus = customerService.deactivateCustomer(1);
		assertEquals(true, updatedStatus);
	}

	@Test
	public void deactivateCustomer_NotFound() {
		when(customerRepository.findByIdAndIsActiveIsTrue(Mockito.anyInt())).thenReturn(null);
		boolean updatedStatus = customerService.deactivateCustomer(200);
		assertEquals(false, updatedStatus);
	}
}