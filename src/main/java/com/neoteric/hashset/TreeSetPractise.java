package com.neoteric.hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractise {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        System.out.println("treeset content is : " + treeSet);
        treeSet.remove(3);
        System.out.println("treeset content is :");
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + ",");
        }
    }
}
