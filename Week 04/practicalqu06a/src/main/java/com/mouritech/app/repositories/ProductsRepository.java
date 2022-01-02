package com.mouritech.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.app.models.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}
