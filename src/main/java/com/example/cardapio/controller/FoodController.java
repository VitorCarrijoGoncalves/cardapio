package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodResponseDTO;
import com.example.cardapio.repository.FoodRepository;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public List<FoodResponseDTO> getAll() {

        List<Food> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new)
        return foodList;
        
    }
    
}
