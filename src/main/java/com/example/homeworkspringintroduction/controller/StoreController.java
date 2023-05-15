package com.example.homeworkspringintroduction.controller;

import com.example.homeworkspringintroduction.model.Item;
import com.example.homeworkspringintroduction.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "add")
    public void add(@RequestParam("id") Set<Integer> id) {
        storeService.add(id);
    }
@GetMapping(path = "get")
    public List<Item> get() {
        return storeService.get();
    }
}
