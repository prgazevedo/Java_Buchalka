package com.Section6.OOP1_Classes_Constructors_Inheritance;

public class VipCustomer {
    private String name;
    private double credit;
    private String email;

    public VipCustomer() {
        this("defaultName", 0.0, "defaultEmail");
    }

    public VipCustomer(String name, double credit) {
        this(name, credit, "defaultEmail");
    }

    public VipCustomer(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
