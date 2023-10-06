package org.example;

import org.example.employees.Employee;

public class PayrollOffice {
    public void paySalary(Employee employee) throws SalaryPaidOnBankException {
        double salary = employee.calculateSalary();

        if (salary <= 7000) {
            System.out.println("Paying a salary of " + salary + "$ to " + employee.getPosition() + " " + employee.getName() + " " + employee.getSurname() + " in cash.");
        } else {
            System.err.println("Paying a salary of " + salary + "$ to " + employee.getPosition() + " " + employee.getName() + " " + employee.getSurname() + " throw the bank.");
        }

    }
}
