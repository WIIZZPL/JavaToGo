package org.wiizz.projekt.javatogo.models.persons;

import org.wiizz.projekt.javatogo.models.Review;

import java.util.UUID;

public class RestaurantRep extends Person {
    String PESEL;

    public RestaurantRep() {

    }

    public RestaurantRep(UUID uuid, String fName, String sName, String phone, String email, String address, String PESEL) {
        super(uuid, fName, sName, phone, email, address);
        this.PESEL = PESEL;
    }

    public RestaurantRep(RestaurantRep other) {
        super(other);
        this.PESEL = other.PESEL;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public Review respond(Review review, String text) {
        review.setRespondedBy(this);
        review.setRepsResponse(text);
        return review;
    }
}
