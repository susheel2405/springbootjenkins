package com.neoteric.mysqljdbcconnection;

import java.util.List;

public class JDBCTest {
    public static void main(String[] args) {
       // JDBCConnection.getAllocationEmployees();
        List<Employee> employees = SelfJoin.getEmployeeManagerHierarchy();
        for (Employee employee : employees){
            System.out.println(employee);
        }


    }

}
