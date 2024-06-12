package com.example.db_evaluacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db_evaluacion.models.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{
    
}
