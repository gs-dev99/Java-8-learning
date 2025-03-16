package com.javastreams.employeemanagement.service;

import com.javastreams.employeemanagement.data.EmployeeData;
import com.javastreams.employeemanagement.model.Employee;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        // TODO : Filter Employee Salary > 60000
        employees.stream().filter(x -> x.getSalary() >60000).forEach(System.out::println);

        // TODO: Sort employees by salary (Descending Order)
        employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).forEach(System.out::println);

        // TODO: Sort employees by salary (Ascending Order) but more simpler syntax
        employees.stream().sorted(Comparator.comparing(Employee :: getSalary)).forEach(System.out::println);

        //Reference
//        Integer.compare(10, 20); // Returns -1 → 10 comes before 20
//        Integer.compare(20, 20); // Returns 0  → Both are equal, no change
//        Integer.compare(30, 20); // Returns 1  → 30 comes after 20



    }
}
