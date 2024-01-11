package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.Courier;
import org.wiizz.projekt.javatogo.models.persons.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    User orderedBy;
    Courier handledBy;
    Restaurant madeBy;
    List<Dish> dishes;

    public Order() {

    }

    public Order(User orderedBy, Restaurant madeBy, Dish[] dishes) {
        this.orderedBy = orderedBy;
        this.madeBy = madeBy;
        this.dishes = Arrays.stream(dishes).toList();
    }

    public Order(User orderedBy, Courier handledBy, Restaurant madeBy, Dish[] dishes) {
        this.orderedBy = orderedBy;
        this.handledBy = handledBy;
        this.madeBy = madeBy;
        this.dishes = Arrays.stream(dishes).toList();
    }

    public Order(Order other) {
        this.orderedBy = other.orderedBy;
        this.handledBy = other.handledBy;
        this.madeBy = other.madeBy;
        this.dishes = new ArrayList<>(other.dishes);
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
        return (Dish[]) dishes.toArray();
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = Arrays.stream(dishes).toList();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }
}
