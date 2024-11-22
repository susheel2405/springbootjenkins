package com.neoteric.dockerlearning.mappractice;

public class Employee {
    private String name;
    private int age;
    private String departement;

    public Employee(String departement, int age, String name) {
        this.departement = departement;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartement() {
        return departement;
    }

    public String getName() {
        return name;
    }

}
