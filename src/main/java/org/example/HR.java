package org.example;

import org.example.employees.*;

public class HR {
    public Employee getAnEmployee() {
        Employee e = null;
        int i = (int) (5 * Math.random());

        switch (i) {
            case 1 -> e = new Secretary(2, "Jennifer", "Vegas", 9, "Sales", "Secretary",
                    new Manager(3, "Albert", "Jonathan", 17, "Sales", "Manager", "Sales"));
            case 2 -> e = new Engineer(4, "Allan", "Bruno", 5, "Production", "Engineer", "Improving production");
            case 3 -> e = new Manager(5, "Elba", "Wisdom", 14, "Production", "Manager", "Production");
            case 4 -> e = new Director(6, "Brad", "Johnson", 24, "Management", "Director", "Management", 4500);
            case 5 -> e = new Boss(7, "Robin", "Tracy", 34, "Main", "Boss", "Main Branch");
        }
        return e;
    }
}
