package com.neoteric.dockerlearning.mappractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String , Employee> hashMap = new HashMap<>();


        hashMap.put("E1" , new Employee("IT",21,"Susheel"));
        hashMap.put("E2",new Employee("IT",23,"Rakesh"));
        hashMap.put("E3", new Employee("Manager", 22,"Keerthi"));





        for (Map.Entry<String,Employee> entry:hashMap.entrySet()){
            System.out.println("key:" + entry.getKey()+ ",value" + entry.getValue());
        }
    }
}
