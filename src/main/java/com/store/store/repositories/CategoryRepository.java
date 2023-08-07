package com.store.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.store.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
