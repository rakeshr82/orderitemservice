package com.orderitemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderitemservice.entity.OrderItemService;
import com.orderitemservice.repositry.OrderItemServiceRepositry;


@RestController
public class OrderItemServiceController {
	
	@Autowired 
	private OrderItemServiceRepositry orderItemServiceRepositry;
	
	
	@GetMapping("/retrieveorderItemService")
	public List<OrderItemService> retrieveorderItemService(){
		return orderItemServiceRepositry.findAll();
		
	} 
	
	@PostMapping("/neworder")
	public void createNewOrder(@Validated @RequestBody OrderItemService orderItemService) {
		orderItemServiceRepositry.save(orderItemService);
		
	}
	
}
