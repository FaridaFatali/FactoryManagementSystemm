package org.example.employees;

public abstract class AbstractEmployee implements Employee {
    int no;
    String name;
    String surname;
    int year;
    String department;
    String position;

    int BASE_SALARY = 500;

    public AbstractEmployee(int no, String name, String surname, int year, String department, String position) {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.department = department;
        this.position = position;
    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "\nNo: " + no +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nYear: " + year +
                "\nDepartment: " + department +
                "\nPosition: " + position;
    }
}
