package com.orderitemservice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderitemservice.entity.OrderItemService;


@Repository
public interface OrderItemServiceRepositry extends JpaRepository<OrderItemService, Integer> {

}
