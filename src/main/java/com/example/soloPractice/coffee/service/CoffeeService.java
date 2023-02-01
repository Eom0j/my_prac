package com.example.soloPractice.coffee.service;

import com.example.soloPractice.coffee.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    public Coffee createCoffee(Coffee coffee) {
        Coffee createdCoffee = coffee;
        return createdCoffee;
    }

    public Coffee updateCoffee(Coffee coffee) {
        Coffee updatedCoffee = coffee;
        return updatedCoffee;
    }

    public Coffee findCoffee(long CoffeeId) {
        Coffee coffee = new Coffee(CoffeeId, "아메리카노", "Americano", 2500);
        return coffee;
    }

    public List<Coffee> findCoffees() {
        List<Coffee> coffees = List.of(
                new Coffee(1, "아메리카노", "Americano", 2500),
                new Coffee(2, "카라멜 라떼", "Caramel Latte", 5000)
        );
        return coffees;
    }

    public void deleteCoffee(long coffeeId) {

    }
}
