package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.RestaurantRep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    String name;
    String address;
    FoodCategory[] foodCategories;
    RestaurantRep representedBy;
    List<Dish> dishes;

    List<Order> ordersToMake;
    List<Order> ordersToReceive;

    public Restaurant() {

    }

    public Restaurant(String name, String address, FoodCategory[] foodCategories, RestaurantRep representedBy, Dish[] dishes, Order[] ordersToMake, Order[] ordersToReceive) {
        this.name = name;
        this.address = address;
        this.foodCategories = foodCategories;
        this.representedBy = representedBy;
        this.dishes = Arrays.stream(dishes).toList();
        this.ordersToMake = Arrays.stream(ordersToMake).toList();
        this.ordersToReceive = Arrays.stream(ordersToReceive).toList();
    }

    public Restaurant(Restaurant other) {
        this.name = other.name;
        this.address = other.address;
        this.foodCategories = other.foodCategories.clone();
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

    public FoodCategory[] getFoodCategories() {
        return foodCategories;
    }

    public void setFoodCategories(FoodCategory[] foodCategories) {
        this.foodCategories = foodCategories;
    }

    public RestaurantRep getRepresentedBy() {
        return representedBy;
    }

    public void setRepresentedBy(RestaurantRep representedBy) {
        this.representedBy = representedBy;
    }

    public Dish[] getDishes() {
        return (Dish[]) dishes.toArray();
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = Arrays.stream(dishes).toList();
    }

    public Order[] getOrdersToMake() {
        return (Order[]) ordersToMake.toArray();
    }

    public void setOrdersToMake(Order[] ordersToMake) {
        this.ordersToMake = Arrays.stream(ordersToMake).toList();
    }

    public Order[] getOrdersToReceive() {
        return (Order[]) ordersToReceive.toArray();
    }

    public void setOrdersToReceive(Order[] ordersToReceive) {
        this.ordersToReceive = Arrays.stream(ordersToReceive).toList();
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

    public Order[] popOrderToReceive() {
        return popOrdersToReceive(1);
    }

    public Order[] popOrdersToReceive(int number) {
        List<Order> ordersToPop = ordersToReceive.subList(0, number);
        ordersToReceive.remove(ordersToPop);
        return (Order[]) ordersToPop.toArray();
    }
}
