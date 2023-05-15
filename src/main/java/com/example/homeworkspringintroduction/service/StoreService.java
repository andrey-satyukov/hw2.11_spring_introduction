package com.example.homeworkspringintroduction.service;

import com.example.homeworkspringintroduction.component.Basket;
import com.example.homeworkspringintroduction.model.Item;
import com.example.homeworkspringintroduction.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Basket basket;
    private final StoreRepository storeRepository;

    public StoreService (Basket basket, StoreRepository storeRepository) {
        this.basket = basket;
        this.storeRepository = storeRepository;
    }

    public void add(Set<Integer> ids) {
        basket.add(ids);
    }

    public List<Item> get() {
        return basket.get().stream()
                .map(id -> storeRepository.get(id))
                .collect(Collectors.toList());
    }
}
