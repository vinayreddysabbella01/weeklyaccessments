package com.mouritech.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.app.models.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
