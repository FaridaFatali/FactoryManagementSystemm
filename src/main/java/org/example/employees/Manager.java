package org.example.employees;

public class Manager extends AbstractEmployee {
    protected String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 3000;


    public Manager(int no, String name, String surname, int year, String department, String position, String departmentManaged) {
        super(no, name, surname, year, department, position);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work() {
        System.out.println("Manager is working!");
        manage();
    }

    public void manage() {
        System.out.println("Manager manages department: " + departmentManaged);
    }

    public void manageProject(String projectName) {
        System.out.println("Manager manages the project: " + projectName);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + MANAGEMENT_PAYMENT;
    }

    @Override
    public String toString() {
        return "\nMANAGER INFO:\n" + super.toString() + "\nManaged department: " + department;
    }
}
