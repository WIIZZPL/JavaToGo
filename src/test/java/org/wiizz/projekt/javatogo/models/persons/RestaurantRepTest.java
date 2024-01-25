package org.wiizz.projekt.javatogo.models.persons;

import org.junit.jupiter.api.Test;
import org.wiizz.projekt.javatogo.models.Review;

import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantRepTest {

    @Test
    void respondNew() {
        RestaurantRep restaurantRep = new RestaurantRep();
        Review review = new Review();

        String response = "dhasuoidh7y9jcxlczxt8asd67sd8";

        restaurantRep.respond(review, response);

        assertEquals(response, review.getRepsResponse());
    }

    @Test
    void respondOverride() {
        RestaurantRep restaurantRep = new RestaurantRep();
        Review review = new Review();
        review.setRepsResponse("DHASZ<MNmf");

        String response = "dhasuoidh7y9jcxlczxt8asd67sd8";

        restaurantRep.respond(review, response);

        assertEquals(response, review.getRepsResponse());
    }
}