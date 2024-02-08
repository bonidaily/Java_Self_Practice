package day_13_inheritance.person_task;

public class Tester extends Employee{
    public Tester(String name, String employeId, String jobTitle, double salary, String companyName) {
        super(name, employeId, jobTitle, salary, companyName);
    }

    public void work(){
        System.out.println(getJobTitle() +" "+ getName() + " is testing");
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}
/*
2. Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".
 */