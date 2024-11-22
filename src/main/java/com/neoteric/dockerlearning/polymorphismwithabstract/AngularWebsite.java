package com.neoteric.dockerlearning.polymorphismwithabstract;

public abstract class AngularWebsite implements Website{

    private String url;
    public AngularWebsite(String pageurl){
        this.url=pageurl ;
    }

    @Override
    public String header() {
        return "header";
    }

    @Override
    public String footer() {
        return "footer";
    }
    @Override
    public String body(){
        return "default obody";
    }
    //public abstract String body();

    public String page(){
        header();
        footer();
        body();
        return this.getClass().getName();
    }
}
