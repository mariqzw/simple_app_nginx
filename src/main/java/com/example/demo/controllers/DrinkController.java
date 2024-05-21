package com.example.demo.controllers;

import com.example.demo.models.Drink;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/drinks")
public class DrinkController {
    private List<Drink> drinks = new ArrayList<>();

    public DrinkController() {
        drinks.add(new Drink(1, "Latte", 9.99));
        drinks.add(new Drink(2, "Americano", 4.99));
    }

    @GetMapping
    public List<Drink> getDrinks() {
        return drinks;
    }
}

