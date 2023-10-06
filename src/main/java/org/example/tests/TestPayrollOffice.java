package org.example.tests;

import org.example.*;
import org.example.employees.*;

public class TestPayrollOffice {
    public static void main(String[] args) {
        PayrollOffice payrollOffice = new PayrollOffice();

        try {
            payrollOffice.paySalary(new Boss(10, "Robin", "Tracy", 34, "Main", "Boss", "Main Branch"));
            payrollOffice.paySalary(new Director(6, "Thomas", "David", 22, "Management", "Director", "Management", 5000));
            payrollOffice.paySalary(new Director(3, "David", "Gonzales", 20, "Management", "Director", "Management", 3000));
            payrollOffice.paySalary(new Manager(5, "Henry", "Graham", 13, "Sales", "Manager", "Sales"));
            payrollOffice.paySalary(new Manager(2, "Angelina", "Lopez", 9, "Production", "Manager", "Production"));
            payrollOffice.paySalary(new Engineer(7, "James", "Peterson", 12, "Production", "Engineer", "X ARGE"));
            payrollOffice.paySalary(new Engineer(9, "Jon", "Teller", 4, "Production", "Engineer", "Y ARGE"));
            payrollOffice.paySalary(new Secretary(8, "Sarah", "Giovanni", 9, "Sales", "Secretary", new Manager(5, "Henry", "Graham", 13, "Sales", "Manager", "Sales")));
            payrollOffice.paySalary(new Secretary(8, "Miranda", "Anniston", 3, "Production", "Secretary", new Manager(2, "Angelina", "Lopez", 3, "Production", "Manager", "Production")));
        } catch (SalaryPaidOnBankException e) {
            System.out.println(e.getMessage());
        }
    }
}
