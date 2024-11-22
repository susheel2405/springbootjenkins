package com.neoteric.dockerlearning.streamsdemo;

import java.util.ArrayList;
import java.util.List;

public class StemaDemoTest {



    public static void main(String[] args) {


        List<Employee>employeeList = new ArrayList<>();
        employeeList.add(new Employee("1"));
        employeeList.add(new Employee("2"));
        employeeList.add(new Employee("3"));
        employeeList.add(new Employee("4"));



        int startIndex = 0;
        int endIndex = employeeList.size();


        System.out.println(employeeList.get(endIndex-1));

    }
}
