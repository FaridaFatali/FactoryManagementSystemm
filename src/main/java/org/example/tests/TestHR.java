package org.example.tests;

import org.example.HR;
import org.example.employees.Employee;

// Getting random employee throw HR class (getAnEmployee() method)

public class TestHR {
    public static void main(String[] args) {
        HR hr = new HR();

        Employee e = hr.getAnEmployee();
        e.work();
        System.out.println();
    }
}
