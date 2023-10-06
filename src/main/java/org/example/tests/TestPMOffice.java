package org.example.tests;

import org.example.PMOffice;
import org.example.employees.*;

public class TestPMOffice {
    public static void main(String[] args) {
        PMOffice pmOffice = new PMOffice();

        Manager m1 = new Manager(3, "Albert", "Jonathan", 17, "Sales", "Manager", "Sales");
        pmOffice.manageProject("ProjectX", m1);

        Director d1 = new Director(6, "Brad", "Johnson", 24, "Management", "Director", "Management", 4500);
        pmOffice.manageProject("ProjectY", d1);

    }
}
