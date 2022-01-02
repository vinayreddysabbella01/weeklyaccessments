package com.mouritech.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.app.models.Regions;

@Repository
public interface RegionsRepository extends JpaRepository<Regions, Long>{

}
