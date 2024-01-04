package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.Courier;
import org.wiizz.projekt.javatogo.models.persons.User;

public class Order {
    User orderedBy;
    Courier handledBy;
    Restaurant madeBy;
    Dish[] dishes;

    public Order() {

    }

    public Order(User orderedBy, Courier handledBy, Restaurant madeBy, Dish[] dishes) {
        this.orderedBy = orderedBy;
        this.handledBy = handledBy;
        this.madeBy = madeBy;
        this.dishes = dishes;
    }

    public Order(Order other) {
        this.orderedBy = other.orderedBy;
        this.handledBy = other.handledBy;
        this.madeBy = other.madeBy;
        this.dishes = other.dishes.clone();
    }

    public User getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(User orderedBy) {
        this.orderedBy = orderedBy;
    }

    public Courier getHandledBy() {
        return handledBy;
    }

    public void setHandledBy(Courier handledBy) {
        this.handledBy = handledBy;
    }

    public Restaurant getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(Restaurant madeBy) {
        this.madeBy = madeBy;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }
}
