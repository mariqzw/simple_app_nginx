package com.example.demo.controllers;

import com.example.demo.models.Cafe;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cafes")
public class CafeController {
    private List<Cafe> cafes = new ArrayList<>();

    public CafeController() {
        cafes.add(new Cafe(1, "Green Valley st. 13"));
        cafes.add(new Cafe(2, "Baker st. 221B"));
    }

    @GetMapping
    public List<Cafe> getCafes() {
        return cafes;
    }
}

