package com.neoteric.dockerlearning.mappractice;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String,Employee> treeMap = new java.util.TreeMap<>();

        treeMap.put("E101", new Employee("Marketing", 22, "Venkat"));
        treeMap.put("E102", new Employee("Operations", 21, "Honey"));
        treeMap.put("E103", new Employee("Sales", 25,"Ravi"));

        for (Map.Entry<String ,Employee> entry : treeMap.entrySet()){
            System.out.println("Key:" + entry.getKey()+ ", value:" +entry.getValue());
        }
    }
}
