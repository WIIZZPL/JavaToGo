package org.wiizz.projekt.javatogo.models.persons;

import org.junit.jupiter.api.Test;

import org.wiizz.projekt.javatogo.models.Dish;
import org.wiizz.projekt.javatogo.models.Order;
import org.wiizz.projekt.javatogo.models.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void deliverTo() {
        User userA = new User();
        userA.setUuid(UUID.randomUUID());
        User userB = new User();
        userB.setUuid(UUID.randomUUID());
        Restaurant restaurant = new Restaurant();
        ArrayList<Dish> dishes = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(userA, restaurant, dishes));
        orders.add(new Order(userA, restaurant, dishes));
        orders.add(new Order(userB, restaurant, dishes));

        Courier courier = new Courier();
        courier.setOrders(orders);

        List<Order> userOrders = courier.deliverTo(userA);
        for (Order order : userOrders) {
            assertSame(order.getOrderedBy(), userA);
        }
    }

    @Test
    void deliverToRandom() {
        User userA = new User();
        User userB = new User();
        Restaurant restaurant = new Restaurant();
        ArrayList<Dish> dishes = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Order newOrder;
            if (RandomGenerator.getDefault().nextBoolean()) {
                newOrder = new Order(userA, restaurant, dishes);
            } else {
                newOrder = new Order(userB, restaurant, dishes);
            }
            orders.add(newOrder);
        }

        Courier courier = new Courier();
        courier.setOrders(orders);

        List<Order> userOrders = courier.deliverTo(userA);
        for (Order order : userOrders) {
            assertSame(order.getOrderedBy(), userA);
        }
    }

    @Test
    void receiveOrderEmpty() {
        Courier courier = new Courier();

        Order order = new Order();
        courier.receiveOrder(order);

        assertTrue(courier.orders.contains(order));
    }

    @Test
    void receiveOrderNotEmpty() {
        Courier courier = new Courier();
        ArrayList<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) orders.add(new Order());
        courier.setOrders(orders);

        Order order = new Order();
        courier.receiveOrder(order);

        assertTrue(courier.orders.contains(order));
    }

    @Test
    void raiseNominal() {
        Courier courier = new Courier();

        int currRate = 50;

        for (int i = 0; i < 100; i++) {
            courier.setRatePerKm(50);
            int changeRate = RandomGenerator.getDefault().nextInt(-50, 50);
            courier.raiseNominal(changeRate);
            assertEquals(currRate + changeRate, courier.getRatePerKm());
        }
    }

    @Test
    void raisePercent() {
        Courier courier = new Courier();

        int startingRate = 50;

        for (int i = 0; i < 100; i++) {
            courier.setRatePerKm(startingRate);
            float changeRate = RandomGenerator.getDefault().nextFloat(-1, 2);
            courier.raisePercent(changeRate);
            assertEquals(startingRate + startingRate*changeRate, courier.getRatePerKm());
        }
    }
}