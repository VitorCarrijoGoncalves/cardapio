package com.example.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cardapio.food.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
