package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.Courier;
import org.wiizz.projekt.javatogo.models.persons.User;

public class Order {
    User orderedBy;
    Courier handledBy;
    Restaurant madeBy;
    Dish[] dishes;

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
