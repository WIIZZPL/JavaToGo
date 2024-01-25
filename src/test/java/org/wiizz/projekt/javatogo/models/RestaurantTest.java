package org.wiizz.projekt.javatogo.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void addDishEmpty() {
        Restaurant restaurant = new Restaurant();

        Dish dish = new Dish();

        restaurant.addDish(dish);

        assertTrue(restaurant.getDishes().contains(dish));
    }

    @Test
    void addDishNotEmpty() {
        Restaurant restaurant = new Restaurant();
        ArrayList<Dish> dishes = new ArrayList<>();
        for (int i = 0; i < 10; i++) dishes.add(new Dish());
        restaurant.setDishes(dishes);

        Dish dish = new Dish();

        restaurant.addDish(dish);

        assertTrue(restaurant.getDishes().contains(dish));
    }

    @Test
    void removeDish() {
        Restaurant restaurant = new Restaurant();
        ArrayList<Dish> dishes = new ArrayList<>();
        for (int i = 0; i < 10; i++) dishes.add(new Dish());
        restaurant.setDishes(dishes);

        Dish dish = dishes.get(RandomGenerator.getDefault().nextInt(dishes.size()));

        restaurant.removeDish(dish);

        assertFalse(restaurant.getDishes().contains(dish));
    }

    @Test
    void addOrderToMake() {
        Restaurant restaurant = new Restaurant();

        Order order = new Order();

        restaurant.addOrderToMake(order);

        assertTrue(restaurant.getOrdersToMake().contains(order));
    }

    @Test
    void makeOrder() {
        Restaurant restaurant = new Restaurant();

        Order order = new Order();

        restaurant.addOrderToMake(order);

        assertTrue(restaurant.getOrdersToMake().contains(order));

        restaurant.makeOrder(order);

        assertFalse(restaurant.getOrdersToMake().contains(order));
        assertTrue(restaurant.getOrdersToReceive().contains(order));
    }


    @Test
    void popOrdersToReceive() {
        Restaurant restaurant = new Restaurant();
        ArrayList<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) orders.add(new Order());
        restaurant.setOrdersToReceive(orders);

        int numberOfOrdersPopped = 4;

        ArrayList<Order> ordersReceived = restaurant.popOrdersToReceive(4);

        assertEquals(4, numberOfOrdersPopped);

        for (Order orderReceived : ordersReceived) {
            assertFalse(restaurant.getOrdersToReceive().contains(orderReceived));
        }
    }

}