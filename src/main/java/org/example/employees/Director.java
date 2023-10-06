package org.example.employees;

public class Director extends Manager {
    protected double bonus;

    public Director(int no, String name, String surname, int year, String department, String position, String departmentManaged, double bonus) {
        super(no, name, surname, year, department, position, departmentManaged);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Director is working!");
        manage();
    }

    @Override
    public void manage() {
        System.out.println("Director manages whole company!");
        makeAStrategicPlan();
    }

    public void makeAStrategicPlan() {
        System.out.println("Director makes a strategic plan for the company!");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }


    @Override
    public String toString() {
        return "\nDIRECTOR INFO:\n" +
                "\nNo: " + no +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nYear: " + year +
                "\nDepartment: " + department +
                "\nPosition: " + position +
                "\nBonus: " + bonus;
    }
}