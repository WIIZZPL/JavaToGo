package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.RestaurantRep;

public class Restaurant {
    String name;
    String address;
    FoodCategory[] foodCategories;
    RestaurantRep representedBy;
    Dish[] dishes;

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
