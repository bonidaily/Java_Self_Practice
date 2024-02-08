package day_13_inheritance.person_task;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String employeId, String jobTitle, double salary, String companyName,String programmingLanguage) {
        super(name, employeId, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString() + ", programmingLanguage ='" + programmingLanguage +'\'' + "}";
    }
}
/*
 2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */