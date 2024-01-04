package org.wiizz.projekt.javatogo.models.persons;

import java.util.UUID;

public class Courier extends Person {
    float ratePerKm;
    String PESEL;

    public Courier() {

    }

    public Courier(UUID uuid, String fName, String sName, String phone, String email, String address, float ratePerKm, String PESEL) {
        super(uuid, fName, sName, phone, email, address);
        this.ratePerKm = ratePerKm;
        this.PESEL = PESEL;
    }

    public Courier(Courier other) {
        super(other);
        this.ratePerKm = other.ratePerKm;
        this.PESEL = other.PESEL;
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
}
