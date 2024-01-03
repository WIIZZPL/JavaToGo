package org.wiizz.projekt.javatogo.models;

import org.wiizz.projekt.javatogo.models.persons.RestaurantRep;
import org.wiizz.projekt.javatogo.models.persons.User;

public class Review {
    User postedBy;
    Order regardingOrder;
    Restaurant forRestaurant;

    int score;
    String text;

    String repsResponse;
    RestaurantRep respondedBy;

    public User getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }

    public Order getRegardingOrder() {
        return regardingOrder;
    }

    public void setRegardingOrder(Order regardingOrder) {
        this.regardingOrder = regardingOrder;
    }

    public Restaurant getForRestaurant() {
        return forRestaurant;
    }

    public void setForRestaurant(Restaurant forRestaurant) {
        this.forRestaurant = forRestaurant;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRepsResponse() {
        return repsResponse;
    }

    public void setRepsResponse(String repsResponse) {
        this.repsResponse = repsResponse;
    }

    public RestaurantRep getRespondedBy() {
        return respondedBy;
    }

    public void setRespondedBy(RestaurantRep respondedBy) {
        this.respondedBy = respondedBy;
    }
}
