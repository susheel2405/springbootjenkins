package com.neoteric.dockerlearning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorPractise {
    class Student{

        int age;
        String name;

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public class Comparator<I extends Number> {
        public static void main(String[] args) {


            ComparatorPractise com = new ComparatorPractise(){
                public int compare(int i, int j){
                    if (i%10 > j%10)
                        return 1;
                    else
                        return -1;

                }
            };
            List<Integer> nums = new ArrayList<>();
            nums.add(43);
            nums.add(31);
            nums.add(25);
            nums.add(26);
            Collections.sort(nums);
            System.out.println(nums);
        }
    }
}
