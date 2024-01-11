package org.wiizz.projekt.javatogo.models.persons;

import org.junit.jupiter.api.Test;

import org.wiizz.projekt.javatogo.models.Dish;
import org.wiizz.projekt.javatogo.models.Order;
import org.wiizz.projekt.javatogo.models.Restaurant;

import java.util.List;
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
        Dish[] dishes = {};
        Order[] orders = {new Order(userA, restaurant, dishes), new Order(userA, restaurant, dishes), new Order(userB, restaurant, dishes)};

        Courier courier = new Courier();
        courier.setOrders(orders);

        List<Order> userOrders = courier.deliverTo(userA);
        for (Order order : userOrders) {
            assertSame(order.getOrderedBy(), userA);
        }
    }

    @Test
    void receiveOrder() {
    }

    @Test
    void raiseNominal() {
    }

    @Test
    void raisePercent() {
    }
}