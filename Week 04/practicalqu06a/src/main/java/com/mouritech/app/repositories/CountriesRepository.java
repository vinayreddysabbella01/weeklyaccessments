package com.mouritech.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.app.models.Countries;


@Repository
public interface CountriesRepository extends JpaRepository<Countries, Long> {

}
