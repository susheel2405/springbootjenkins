package com.neoteric.hashset;

import java.util.*;

public class HashSetPractise {

    public static void main(String[] args) {
        Set<String> names  = new HashSet<>();

        names.add("Susheel");
        names.add("Ravi");
        names.add("Rakesh");
        names.add("Rahul");
        names.add("Ganesh");
        names.add("Tirumala");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);

        System.out.println(numberList);


        Set<Integer> numberSet = new HashSet<>(numberList);
        numberSet.addAll(numberList);
        System.out.println(numberSet);
    }
}
