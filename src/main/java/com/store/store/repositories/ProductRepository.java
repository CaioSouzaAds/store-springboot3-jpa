package com.store.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.store.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
