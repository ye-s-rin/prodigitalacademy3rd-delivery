package com.example.demo.food;

import org.springframework.stereotype.Service;

@Service
public class FoodService {

    FoodRepository foodRepository;

    public Food findFood(int id) {
        return this.foodRepository.findFood(id);
    }
}
