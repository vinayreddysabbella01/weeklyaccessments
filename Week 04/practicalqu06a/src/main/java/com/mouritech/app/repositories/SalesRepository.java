package com.mouritech.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouritech.app.models.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long>{

}
