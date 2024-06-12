package com.example.db_evaluacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db_evaluacion.models.Episode;

public interface EpisodeRepository extends JpaRepository<Episode, Long>{
    
}
