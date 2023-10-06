package org.example.employees;

public class Boss extends AbstractEmployee {
    protected String branch;
    public static final int EXTRA = 10000;


    public Boss(int no, String name, String surname, int year, String department, String position, String branch) {
        super(no, name, surname, year, department, position);
        this.branch = branch;
    }

    public void work() {
        System.out.println("Boss is working for the company!");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + EXTRA;
    }

    @Override
    public String toString() {
        return "\nBOSS INFO:\n" + super.toString() + "\nBranch: " + branch;
    }
}
