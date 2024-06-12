package com.example.db_evaluacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db_evaluacion.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
