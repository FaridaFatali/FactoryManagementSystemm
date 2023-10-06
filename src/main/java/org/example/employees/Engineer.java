package org.example.employees;

public class Engineer extends AbstractEmployee {
    private String project;

    public Engineer(int no, String name, String surname, int year, String department, String position, String project) {
        super(no, name, surname, year, department, position);
        this.project = project;
    }

    public void work() {
        System.out.println("Engineer is working on a project: " + project);
        assignTask("A very important task.");
    }

    public void assignTask(String task) {
        System.out.println("Engineer " + name + " works on the task: " + task);
    }

    @Override
    public String toString() {
        return "\nENGINEER INFO:\n" + super.toString() + "\nProject: " + project;
    }
}
