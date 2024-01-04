package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.RestaurantRep;

public class Restaurant {
    String name;
    String address;
    FoodCategory[] foodCategories;
    RestaurantRep representedBy;
    Dish[] dishes;

    public Restaurant() {

    }

    public Restaurant(String name, String address, FoodCategory[] foodCategories, RestaurantRep representedBy, Dish[] dishes) {
        this.name = name;
        this.address = address;
        this.foodCategories = foodCategories;
        this.representedBy = representedBy;
        this.dishes = dishes;
    }

    public Restaurant(Restaurant other) {
        this.name = other.name;
        this.address = other.address;
        this.foodCategories = other.foodCategories.clone();
        this.representedBy = other.representedBy;
        this.dishes = other.dishes.clone();
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
        return dishes;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }
}
