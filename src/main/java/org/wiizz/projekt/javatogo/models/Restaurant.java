package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.RestaurantRep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    String name;
    String address;
    ArrayList<FoodCategory> foodCategories = new ArrayList<>();
    RestaurantRep representedBy;
    ArrayList<Dish> dishes = new ArrayList<>();
    ArrayList<Order> ordersToMake = new ArrayList<>();
    ArrayList<Order> ordersToReceive = new ArrayList<>();

    public Restaurant() {

    }

    public Restaurant(String name, String address, ArrayList<FoodCategory> foodCategories, RestaurantRep representedBy, ArrayList<Dish> dishes, ArrayList<Order> ordersToMake, ArrayList<Order> ordersToReceive) {
        this.name = name;
        this.address = address;
        this.foodCategories = new ArrayList<>(foodCategories);
        this.representedBy = representedBy;
        this.dishes = new ArrayList<>(dishes);
        this.ordersToMake = new ArrayList<>(ordersToMake);
        this.ordersToReceive = new ArrayList<>(ordersToReceive);
    }

    public Restaurant(Restaurant other) {
        this.name = other.name;
        this.address = other.address;
        this.foodCategories = new ArrayList<>(other.foodCategories);
        this.representedBy = other.representedBy;
        this.dishes = new ArrayList<>(other.dishes);
        this.ordersToMake = new ArrayList<>(other.ordersToMake);
        this.ordersToReceive = new ArrayList<>(other.ordersToReceive);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<FoodCategory> getFoodCategories() {
        return new ArrayList<>(foodCategories);
    }

    public void setFoodCategories(ArrayList<FoodCategory> foodCategories) {
        this.foodCategories = new ArrayList<>(foodCategories);
    }

    public RestaurantRep getRepresentedBy() {
        return representedBy;
    }

    public void setRepresentedBy(RestaurantRep representedBy) {
        this.representedBy = representedBy;
    }

    public ArrayList<Dish> getDishes() {
        return new ArrayList<>(dishes);
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = new ArrayList<>(dishes);
    }

    public ArrayList<Order> getOrdersToMake() {
        return new ArrayList<>(ordersToMake);
    }

    public void setOrdersToMake(ArrayList<Order> ordersToMake) {
        this.ordersToMake = new ArrayList<>(ordersToMake);
    }

    public ArrayList<Order> getOrdersToReceive() {
        return new ArrayList<>(ordersToReceive);
    }

    public void setOrdersToReceive(ArrayList<Order> ordersToReceive) {
        this.ordersToReceive = new ArrayList<>(ordersToReceive);
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public void addOrderToMake(Order order) {
        ordersToMake.add(order);
    }

    public void makeOrder(Order order) {
        ordersToMake.remove(order);
        ordersToReceive.add(order);
    }

    public ArrayList<Order> popOrderToReceive() {
        return popOrdersToReceive(1);
    }

    public ArrayList<Order> popOrdersToReceive(int number) {
        ArrayList<Order> ordersToPop = new ArrayList<>(ordersToReceive.subList(0, number));
        ordersToReceive.removeAll(ordersToPop);
        return new ArrayList<>(ordersToPop);
    }
}
