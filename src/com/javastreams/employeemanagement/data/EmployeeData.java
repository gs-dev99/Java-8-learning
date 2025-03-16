package com.javastreams.employeemanagement.data;

import com.javastreams.employeemanagement.model.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return Arrays.asList(
                new Employee(101, "Ajay", "HR", 40000, LocalDate.of(2015, 10, 31)),
                new Employee(102, "Sunita", "Admin", 75000, LocalDate.of(2022, 5, 8)),
                new Employee(104, "Sunita", "HR", 10000, LocalDate.of(2014, 10, 14)),
                new Employee(105, "Bheem", "Admin", 100000, LocalDate.of(2012, 7, 26)),
                new Employee(103, "Muthu", "Accounts", 25000, LocalDate.of(2024, 8, 26))
        );
    }
}
