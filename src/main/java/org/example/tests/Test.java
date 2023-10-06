package org.example.tests;

import org.example.employees.*;

/**
 * Practice: Udemy course "Object-Oriented and Functional Programming with Java" by Akin Kaldiroglu
 *
 * @author Farida Fatali
 * Factory Management System in Java for practice of Polymorphism, Abstraction, Interface and Exceptions
 * Employee Hierarchy included Boss, Director, Engineer, Manager, Secretary.
 * Calculating their salary, getting info about them.
 */

public class Test {
    public static void main(String[] args) {
        Boss b1 = new Boss(1, "Jon", "Davis", 4, "Main", "Boss", "Main Branch");
        b1.work();
        System.out.println("Salary: " + b1.calculateSalary());

        System.out.println();

        Manager m1 = new Manager(3, "Albert", "Jonathan", 17, "Sales", "Manager", "Sales");
        m1.work();
        System.out.println("Salary: " + m1.calculateSalary());

        System.out.println();

        Director d1 = new Director(6, "Brad", "Johnson", 24, "Management", "Director", "Management", 4500);
        d1.work();
        System.out.println("Salary: " + m1.calculateSalary());
    }
}