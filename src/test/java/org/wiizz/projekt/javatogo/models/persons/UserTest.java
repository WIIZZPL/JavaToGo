package org.wiizz.projekt.javatogo.models.persons;

import org.junit.jupiter.api.Test;
import org.wiizz.projekt.javatogo.models.Dish;
import org.wiizz.projekt.javatogo.models.Order;
import org.wiizz.projekt.javatogo.models.Restaurant;
import org.wiizz.projekt.javatogo.models.Review;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void makeOrder() {
        User user = new User();
        Restaurant restaurant = new Restaurant();
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish());
        dishes.add(new Dish());
        dishes.add(new Dish());

        Order order = user.makeOrder(restaurant, dishes);

        assertSame(user, order.getOrderedBy());
        assertSame(restaurant, order.getMadeBy());
        for (int i = 0; i < dishes.size(); i++) {
            assertEquals(dishes.get(i), order.getDishes().get(i));
        }
    }

    @Test
    void makeReview() {
        User user = new User();
        Order order = new Order();

        int score = RandomGenerator.getDefault().nextInt(1, 5);
        String text = "hdfidhjasd879Y2983u193j";

        Review review = user.makeReview(order, score, text);

        assertEquals(user, review.getPostedBy());
        assertEquals(order, review.getRegardingOrder());
        assertEquals(score, review.getScore());
        assertEquals(text, review.getText());
    }
}