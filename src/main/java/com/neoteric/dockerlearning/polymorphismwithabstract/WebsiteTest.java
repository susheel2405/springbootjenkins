package com.neoteric.dockerlearning.polymorphismwithabstract;

public class WebsiteTest {
    public static void main(String[] args) {
        AngularWebsite bookticketpage = new BookingTicket();
        System.out.println(bookticketpage.page());
    }
}
