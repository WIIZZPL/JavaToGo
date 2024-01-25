package org.wiizz.projekt.javatogo.models.persons;

import org.wiizz.projekt.javatogo.models.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.Arrays.stream;

public class Courier extends Person {
    float ratePerKm;
    String PESEL;

    ArrayList<Order> orders = new ArrayList<>();

    public Courier() {
    }

    public Courier(UUID uuid, String fName, String sName, String phone, String email, String address, float ratePerKm, String PESEL, ArrayList<Order> orders) {
        super(uuid, fName, sName, phone, email, address);
        this.ratePerKm = ratePerKm;
        this.PESEL = PESEL;
        this.orders = new ArrayList<>(orders);
    }

    public Courier(Courier other) {
        super(other);
        this.ratePerKm = other.ratePerKm;
        this.PESEL = other.PESEL;
        this.orders = new ArrayList<>(orders);
    }

    public float getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(float ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public ArrayList<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = new ArrayList<>(orders);
    }

    public ArrayList<Order> deliverTo(User user) {
        ArrayList<Order> userOrders = new ArrayList<>(orders.stream().filter(order -> order.getOrderedBy() == user).toList());
        orders.removeAll(userOrders);
        return userOrders;
    }

    public void receiveOrder(Order order) {
        orders.add(order);
    }

    public void raiseNominal(float ratePerKmRaise) {
        ratePerKm += ratePerKmRaise;
    }

    public void raisePercent(float ratePerKmRaisePercent) {
        ratePerKm += ratePerKm*ratePerKmRaisePercent;
    }
}
