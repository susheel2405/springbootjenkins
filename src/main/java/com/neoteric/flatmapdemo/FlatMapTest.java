package com.neoteric.flatmapdemo;

public class FlatMapTest {
    public static void main(String[] args) {


        Student susheel = new Student();
        susheel.setName("susheel");
        susheel.setId("1");

        Subject english = new Subject();
        english.setName("English");
        english.setMarks(80);
        susheel.add(english);


        Subject telugu = new Subject();
        telugu.setName("Telugu");
        telugu.setMarks(88);
        susheel.add(telugu);


        Subject chemistry = new Subject();
        chemistry.setName("Chemistry");
        chemistry.setMarks(60);
        susheel.add(chemistry);




    }

}
