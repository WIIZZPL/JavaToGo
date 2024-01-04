package org.wiizz.projekt.javatogo.models;

public class Dish {
    String name;
    float price;
    Allergen[] allergens;
    String[] userParams;

    public Dish() {
    }

    public Dish(String name, float price, Allergen[] allergens, String[] userParams) {
        this.name = name;
        this.price = price;
        this.allergens = allergens;
        this.userParams = userParams;
    }

    public Dish(Dish other) {
        this.name = other.name;
        this.price = other.price;
        this.allergens = other.allergens.clone();
        this.userParams = other.userParams.clone();
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

    public Allergen[] getAllergens() {
        return allergens;
    }

    public void setAllergens(Allergen[] allergens) {
        this.allergens = allergens;
    }

    public String[] getUserParams() {
        return userParams;
    }

    public void setUserParams(String[] userParams) {
        this.userParams = userParams;
    }
}
