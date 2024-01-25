package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.User;

import java.util.ArrayList;

public class Dish {
    String name;
    float price;
    ArrayList<Allergen> allergens = new ArrayList<>();
    ArrayList<String> userParams = new ArrayList<>();

    public Dish() {
    }

    public Dish(String name, float price, ArrayList<Allergen> allergens, ArrayList<String> userParams) {
        this.name = name;
        this.price = price;
        this.allergens = new ArrayList<>(allergens);
        this.userParams = new ArrayList<>(userParams);
    }

    public Dish(Dish other) {
        this.name = other.name;
        this.price = other.price;
        this.allergens = new ArrayList<>(other.allergens);
        this.userParams = new ArrayList<>(other.userParams);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList<Allergen> getAllergens() {
        return new ArrayList<>(allergens);
    }

    public void setAllergens(ArrayList<Allergen> allergens) {
        this.allergens = new ArrayList<>(allergens);
    }

    public ArrayList<String> getUserParams() {
        return new ArrayList<>(userParams);
    }

    public void setUserParams(ArrayList<String> userParams) {
        this.userParams = new ArrayList<>(userParams);
    }
}
