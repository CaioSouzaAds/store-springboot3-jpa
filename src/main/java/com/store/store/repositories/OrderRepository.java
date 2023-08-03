package com.store.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.store.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
