package com.mouritech.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.app.models.Currencies;

@Repository
public interface CurrenciesRepository extends JpaRepository<Currencies, Long>{

}
