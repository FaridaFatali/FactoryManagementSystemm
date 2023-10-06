package org.example;

import org.example.employees.*;

public class HRForManagers extends HR {
    @Override
    public Manager getAnEmployee() {
        Manager m = null;

        int i = (int) (2 * Math.random());

        switch (i) {
            case 0 -> m = new Director(6, "Robert", "Brown", 26, "Management", "Director", "Management", 5000);
            case 1 -> m = new Manager(1, "Elvis", "Verdun", 12, "Production", "Manager", "Production");
        }
        return m;
    }
}
