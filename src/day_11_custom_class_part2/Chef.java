package day_11_custom_class_part2;

import java.util.ArrayList;
import java.util.Collection;

class Chef {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;

    }

    public void makeOrder() {
        System.out.println(name + " is making an order");
    }

    public void washDishes() {
        System.out.println(name + " is washing dishes");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}

