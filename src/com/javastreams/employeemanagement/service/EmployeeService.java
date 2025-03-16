package com.javastreams.employeemanagement.service;

import com.javastreams.employeemanagement.data.EmployeeData;
import com.javastreams.employeemanagement.model.Employee;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        // TODO : Filter Employee Salary > 60000
        System.out.println();
        employees.stream().filter(x -> x.getSalary() > 60000).forEach(System.out::println);

        // TODO: Sort employees by salary (Descending Order)
        System.out.println();
        employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).forEach(System.out::println);
        //The sorted() method is used to sort elements in the stream.


        // TODO: Sort employees by salary (Ascending Order) but more simpler syntax
        System.out.println();
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        //Reference
//        Integer.compare(10, 20); // Returns -1 → 10 comes before 20
//        Integer.compare(20, 20); // Returns 0  → Both are equal, no change
//        Integer.compare(30, 20); // Returns 1  → 30 comes after 20

        // TODO: Multi-Level Sorting: Sort by Department → Then by Salary(Low → High)
        System.out.println();
        employees.stream().sorted((e1, e2) ->
        {
            int depCompare = e1.getDepartment().compareTo(e2.getDepartment());
            return (depCompare != 0) ? depCompare : Double.compare(e1.getSalary(), e2.getSalary());
        }).forEach(System.out::println);

        // TODO : Alternative: Using Comparator.comparing()
        // Cleaner and more readable! ✅
        System.out.println("\nMulti-level Sorting : Comparator.comparing()");
        employees.stream()
                .sorted(Comparator.comparing(Employee :: getDepartment)
                .thenComparing(Employee::getSalary))
        .forEach(System.out::println);


        // TODO: Multi-Level Sorting: Sort by Name → Then by Salary(High → Low)
        System.out.println();
        employees.stream().sorted((e1, e2) ->
        {
            int nameCompare = e1.getName().compareTo(e2.getName());
            return (nameCompare != 0) ? nameCompare : Double.compare(e2.getSalary(), e1.getSalary());
        }).forEach(System.out::println);

        // TODO : Multi-Level Sorting: Sort by Name → Then by Salary(High → Low)
        // Alternative: Using Comparator.comparing()
        // Cleaner and more readable! ✅
        System.out.println("\nMulti-level Sorting : Comparator.comparing()");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary))
                .forEach(System.out::println);




    }
}