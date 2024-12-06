
package com.neoteric.flatmap;

import java.util.*;
import java.util.stream.Collectors;

public class FlatmapTest {
    public static void main(String[] args) {

        Employee susheel = new Employee("Susheel",1,24,50000.0);
        Employee ravi = new Employee("Ravi",2,25,60000.0);

        Employee rahul = new Employee("Rahul",3,24,70000.0);
        Employee ganesh = new Employee("ganesh",4,25,80000.0);

        Employee honey = new Employee("Honey",5,24,90000.0);
        Employee venkat = new Employee("Venkat",6,25,50000.0);

        Employee shailaja = new Employee("Shailaja",7,24,60000.0);
        Employee chandu = new Employee("Chandu",8,25,70000.0);

        Employee rakesh = new Employee("Rakesh",9,24,8000.0);
        Employee keerthi = new Employee("Keerthi",10,25,70000.0);


        Department development = new Department();
        development.setName("Development");
        development.setCode("DEV001");
        development.add(susheel);
        development.add(ravi);

        Department testing = new Department();
        testing.setName("testing");
        testing.setCode("TEST002");
        testing.add(rahul);
        testing.add(ganesh);

        Department support = new Department();
        support.setName("support");
        support.setCode("SUPPORT003");
        support.add(honey);
        support.add(venkat);

        Department accounts = new Department();
        accounts.setName("accounts");
        accounts.setCode("ACC004");
        accounts.add(shailaja);
        accounts.add(chandu);

        Department hr = new Department();
        hr.setName("hr");
        hr.setCode("HR005");
        hr.add(rakesh);
        hr.add(keerthi);

        Company company = new Company();
        company.setName("Amazon");
        company.add(development);
        company.add(testing);
        company.add(support);
        company.add(accounts);
        company.add(hr);

        List<Employee> employeeList = company.getDepartments()
                .stream()
                .flatMap(department -> department.getEmployees()
                        .stream()).collect(Collectors.toList());

        System.out.println(employeeList);

        Optional<Employee> employeeMaxSalary = company.getDepartments()
                .stream()
                .flatMap(department -> department.getEmployees()
                        .stream()).max(Employee::compareTo);

        System.out.println("Max Salary of company: "+employeeMaxSalary);

        Optional<Employee> empMinSalary = company.getDepartments()
                .stream()
                .flatMap(department -> department.getEmployees()
                        .stream()).min(Employee::compareTo);

        System.out.println("Min salary of company: "+empMinSalary);


        OptionalDouble empAvgSalary = company.getDepartments()
                .stream()
                .flatMap(department -> department.getEmployees()
                        .stream()).mapToDouble(Employee::getSalary).average();
        System.out.println("Average Salary of company:"+empAvgSalary);




        Map<String,Optional<Employee>> departmentMinSalary = company.getDepartments()
                .stream()
                .collect(Collectors.toMap(Department::getName,department -> department.getEmployees()
                        .stream().min(Comparator.comparingDouble(Employee::getSalary))));

        System.out.println("Department Min salary"+departmentMinSalary);


        Map<String,Optional<Employee>> departmentMaxSalary = company.getDepartments()
                .stream()
                .collect(Collectors.toMap(Department::getName,department -> department.getEmployees()
                        .stream()
                        .max(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("Department Max salary"+departmentMaxSalary);

        Map<String,OptionalDouble> departmentAvgSalary = company.getDepartments()
                .stream()
                .collect(Collectors.toMap(Department::getName,department -> department.getEmployees()
                        .stream().mapToDouble(Employee::getSalary).average()));
        System.out.println("Department Avg salary"+departmentAvgSalary);

    }
}
