package org.wiizz.projekt.javatogo.models.persons;

import java.util.UUID;

public class User extends Person {
    String defaultDeliveryAddress;

    public User() {

    }

    public User(UUID uuid, String fName, String sName, String phone, String email, String address, String defaultDeliveryAddress) {
        super(uuid, fName, sName, phone, email, address);
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

    public User(User other) {
        super(other);
        this.defaultDeliveryAddress = other.defaultDeliveryAddress;
    }

    public String getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(String defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }
}
