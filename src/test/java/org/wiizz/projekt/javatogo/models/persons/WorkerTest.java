package org.wiizz.projekt.javatogo.models.persons;

import org.junit.jupiter.api.Test;

import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void raiseNominal() {
        Worker worker = new Worker();

        int currRate = 50;

        for (int i = 0; i < 100; i++) {
            worker.setSalary(50);
            int changeRate = RandomGenerator.getDefault().nextInt(-50, 50);
            worker.raiseNominal(changeRate);
            assertEquals(currRate + changeRate, worker.getSalary());
        }
    }

    @Test
    void raisePercent() {
        Worker worker = new Worker();

        int startingRate = 50;

        for (int i = 0; i < 100; i++) {
            worker.setSalary(startingRate);
            float changeRate = RandomGenerator.getDefault().nextFloat(-1, 2);
            worker.raisePercent(changeRate);
            assertEquals(startingRate + startingRate*changeRate, worker.getSalary());
        }
    }
}