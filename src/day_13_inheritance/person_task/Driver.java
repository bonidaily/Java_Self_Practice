package day_13_inheritance.person_task;

public class Driver extends Employee{
    public Driver(String name, String employeId, String jobTitle, double salary, String companyName) {
        super(name, employeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}
/*
 2.4 Driver:
       - work(): Displays "[name] is driving".
 */