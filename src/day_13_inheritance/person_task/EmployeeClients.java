package day_13_inheritance.person_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester employee1 = new Tester("Arbon","12324","Tester",3000,"Google");
        System.out.println(employee1);
        employee1.work();

        Developer employee2 = new Developer("Majling","123123","Developer",4000,"Facebook",
                "Java");

        System.out.println(employee2);
        employee2.work();

        Teacher employee3 = new Teacher("Fitore","23423","Teacher",2500,"AsmundtorpSchool");
        System.out.println(employee3);
        employee3.work();

        Driver employee4 = new Driver("Drilon","34234","Driver",1000,"Cosmonte");
        System.out.println(employee4);
        employee4.work();

    }

}
/*
3. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.
 */