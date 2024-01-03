package org.wiizz.projekt.javatogo.models.persons;

public class User extends Person {
    String defaultDeliveryAddress;



    public String getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(String defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }
}
