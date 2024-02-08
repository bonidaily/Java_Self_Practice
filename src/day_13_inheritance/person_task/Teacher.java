package day_13_inheritance.person_task;

public class Teacher extends Employee {
    public Teacher(String name, String employeId, String jobTitle, double salary, String companyName) {
        super(name, employeId, jobTitle, salary, companyName);
    }
    public void work(){
        System.out.println(getName() + " is teaching");
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
}
/*
2.3 Teacher:
       - work(): Displays "[name] is teaching".

 */