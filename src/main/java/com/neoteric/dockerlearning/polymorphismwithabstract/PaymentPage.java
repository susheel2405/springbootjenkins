package com.neoteric.dockerlearning.polymorphismwithabstract;

public class PaymentPage extends AngularWebsite{

    public PaymentPage(String pageurl) {
        super(pageurl);
    }

    @Override
    public String footer() {
        return "footer page for payment";
    }

    @Override
    public String body() {
        return "from payment body page";
    }

    @Override
    public String header() {
        return super.header()+"Payment page";
    }
}
