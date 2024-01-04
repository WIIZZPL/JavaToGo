package org.wiizz.projekt.javatogo.models.persons;

import java.util.UUID;

public abstract class Person {
    UUID uuid;
    String fName, sName;
    String phone;
    String email;
    String address;

    public Person() {
    }

    public Person(UUID uuid, String fName, String sName, String phone, String email, String address) {
        this.uuid = uuid;
        this.fName = fName;
        this.sName = sName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Person(Person other) {
        this.uuid = other.uuid;
        this.fName = other.fName;
        this.sName = other.sName;
        this.phone = other.phone;
        this.email = other.email;
        this.address = other.address;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
