package com.example.demo.food;

import org.springframework.stereotype.Controller;

@Controller
public class FoodController {

    private FoodService foodService;

    //메뉴 상세 조회
    //URL: /foods/{id} GET
    public Food findFood(int id) {
        return foodService.findFood(id);
    }
}
