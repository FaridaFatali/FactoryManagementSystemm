package org.example.tests;

import org.example.*;
import org.example.employees.*;

// Getting only managers / directors

public class TestHRForManagers {
    public static void main(String[] args) {
        HR hr = new HRForManagers();
        Employee e = hr.getAnEmployee();
        System.out.println(e);

        System.out.println("--------------------");

        HRForManagers hrfm = new HRForManagers();
        Manager m = hrfm.getAnEmployee();
        System.out.println(m);
    }
}
