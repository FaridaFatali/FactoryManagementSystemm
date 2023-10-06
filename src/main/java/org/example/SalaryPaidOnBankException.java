package org.example;

// If the employee's salary is more than 7000$ it should get an exception about paid the salary throw the bank

public class SalaryPaidOnBankException extends Exception {
    public SalaryPaidOnBankException(String message) {
        super(message);
    }
}
