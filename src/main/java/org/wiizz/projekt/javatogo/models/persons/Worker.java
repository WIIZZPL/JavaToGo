package org.wiizz.projekt.javatogo.models.persons;

public class Worker extends Person {
    float salary;

    String PESEL;

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
}
