package com.neoteric.dockerlearning.hashmaptest;


import java.util.*;

public class MapDemoTest {
    public static void main(String[] args) {
        Map<String , Integer> MyMarksMap  = new HashMap<>();
        MyMarksMap.put("Telugu  ", 99);
        MyMarksMap.put("Sanskrit", 98);
        MyMarksMap.put("Maths   ", 74);
        MyMarksMap.put("Hindi   ",89);
        MyMarksMap.put("Botany  ",100);


        Set<Map.Entry<String , Integer>> entries = MyMarksMap.entrySet();

        Iterator<Map.Entry<String , Integer>> entryIterator = entries.iterator();



        while (entryIterator.hasNext()){
           Map.Entry<String , Integer> entryMap =  entryIterator.next();
            System.out.println(entryMap.getKey()+ "    "+ entryMap.getValue());
        }
        MyMarksMap.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey()+ "    "+entry.getValue());
        });
        Map<String , Integer> MyMarksSortedMap  = new TreeMap<>();
        MyMarksSortedMap.put("Telugu  ", 99);
        MyMarksSortedMap.put("Sanskrit", 98);
        MyMarksSortedMap.put("Maths   ", 74);
        MyMarksSortedMap.put("Hindi   ",89);
        MyMarksSortedMap.put("Botany  ",100);

        MyMarksSortedMap.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey()+ "    "+entry.getValue());
        });
    }
}
