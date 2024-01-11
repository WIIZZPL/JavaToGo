package org.wiizz.projekt.javatogo.models.persons;

import org.wiizz.projekt.javatogo.models.Dish;
import org.wiizz.projekt.javatogo.models.Order;
import org.wiizz.projekt.javatogo.models.Restaurant;
import org.wiizz.projekt.javatogo.models.Review;

import java.util.UUID;

public class User extends Person {
    String defaultDeliveryAddress;

    public User() {

    }

    public User(UUID uuid, String fName, String sName, String phone, String email, String address, String defaultDeliveryAddress) {
        super(uuid, fName, sName, phone, email, address);
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

    public User(User other) {
        super(other);
        this.defaultDeliveryAddress = other.defaultDeliveryAddress;
    }

    public String getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(String defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

    public Order makeOrder(Restaurant restaurant, Dish[] dishes) {
        return new Order(this, restaurant, dishes);
    }

    public Review makeReview(Order order, int score, String text){
        return new Review(this, order, order.getMadeBy(), score, text);
    }
}
