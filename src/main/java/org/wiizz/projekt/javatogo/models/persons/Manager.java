package org.wiizz.projekt.javatogo.models.persons;

import java.util.UUID;

public class Manager extends Worker {
    public Manager() {
    }

    public Manager(UUID uuid, String fName, String sName, String phone, String email, String address, float salary, String PESEL) {
        super(uuid, fName, sName, phone, email, address, salary, PESEL);
    }

    public Manager(Worker other) {
        super(other);
    }

}
