package org.wiizz.projekt.javatogo.models.persons;

import java.util.UUID;

public class Worker extends Person {
    float salary;

    String PESEL;

    public Worker() {

    }

    public Worker(UUID uuid, String fName, String sName, String phone, String email, String address, float salary, String PESEL) {
        super(uuid, fName, sName, phone, email, address);
        this.salary = salary;
        this.PESEL = PESEL;
    }

    public Worker(Worker other) {
        super(other);
        this.salary = other.salary;
        this.PESEL = other.PESEL;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public void raiseNominal(float salaryRaise) {
        salary += salaryRaise;
    }

    public void raisePercent(float salaryRaisePercent) {
        salary += salary*salaryRaisePercent;
    }
}
