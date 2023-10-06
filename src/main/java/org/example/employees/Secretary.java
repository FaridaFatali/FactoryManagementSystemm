package org.example.employees;

public class Secretary extends AbstractEmployee {
    protected Manager managerServed;

    public Secretary(int no, String name, String surname, int year, String department, String position, Manager managerServed) {
        super(no, name, surname, year, department, position);
        this.managerServed = managerServed;
    }

    public void work() {
        System.out.println("Secretary is working!");
        serve();
    }

    public void serve() {
        System.out.println("Secretary " + name + " serves her manager:\n" + managerServed);
    }

    @Override
    public String toString() {
        return "\nSECRETARY INFO:\n" + super.toString() + "\nManager Served: " + managerServed;
    }
}
