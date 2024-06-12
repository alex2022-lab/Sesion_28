package com.example.db_evaluacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db_evaluacion.models.Characters;

public interface CharactersRepository extends JpaRepository<Characters, Long>{
    
}
