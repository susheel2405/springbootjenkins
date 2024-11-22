package com.neoteric.dockerlearning.flightbooking;

public class Booking {
    private String name;
    private String passportnumber;
    private int age;
    public Booking(String name, String passportnumber,int age){
        this.name = name;
        this.passportnumber = passportnumber;
        this.age  = age;
    }

    public String getname() {
        return name;
    }

    public String getpassportnumber() {
        return passportnumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", passportnumber='" + passportnumber + '\'' +
                '}';
    }
}
