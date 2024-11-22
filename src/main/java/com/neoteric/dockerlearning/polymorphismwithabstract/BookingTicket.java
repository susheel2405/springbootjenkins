package com.neoteric.dockerlearning.polymorphismwithabstract;

public class BookingTicket extends AngularWebsite{
    public BookingTicket(){
        this("booking ticket");


    }
    public BookingTicket(String name){
        super("");
    }
    @Override
    public String body() {
        return "BookingTicket";
    }
}
