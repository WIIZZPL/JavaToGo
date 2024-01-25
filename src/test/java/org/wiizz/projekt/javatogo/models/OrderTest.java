package org.wiizz.projekt.javatogo.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void addDishEmpty() {
        Order order = new Order();

        Dish dish = new Dish();

        order.addDish(dish);

        assertTrue(order.getDishes().contains(dish));
    }

    @Test
    void addDishNotEmpty() {
        Order order = new Order();
        ArrayList<Dish> dishes = new ArrayList<>();
        for (int i = 0; i < 10; i++) dishes.add(new Dish());
        order.setDishes(dishes);

        Dish dish = new Dish();

        order.addDish(dish);

        assertTrue(order.getDishes().contains(dish));
    }

    @Test
    void removeDishExists() {
        Order order = new Order();
        ArrayList<Dish> dishes = new ArrayList<>();
        for (int i = 0; i < 10; i++) dishes.add(new Dish());
        order.setDishes(dishes);

        Dish dish = dishes.get(RandomGenerator.getDefault().nextInt(dishes.size()));

        order.removeDish(dish);

        assertFalse(order.getDishes().contains(dish));
    }

    @Test
    void removeDishNotExists() {
        Order order = new Order();
        ArrayList<Dish> dishes = new ArrayList<>();
        for (int i = 0; i < 10; i++) dishes.add(new Dish());
        order.setDishes(dishes);

        Dish dish = new Dish();

        order.removeDish(dish);

        assertFalse(order.getDishes().contains(dish));
    }
}