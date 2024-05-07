package com.example.demo.food;

import org.springframework.stereotype.Repository;
import java.util.Map;
import java.util.HashMap;

@Repository
public class FoodRepository {

    private Map<Integer, Food> foodTable = new HashMap<>();

    public Food findFood(int id) {
        return foodTable.get(id);
    }
}
