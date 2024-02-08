package day_13_inheritance.student_task;

public class StudentClient {


    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Arbon", 30, "Male", "ArbonShehu01", "SDET",
                'A', "Cydeo", 103, 03, "Java");

        student1.study();
        System.out.println(student1);

        System.out.println("------------------------------------------------------------------------------------------");

        GraduateStudent student2 = new GraduateStudent("Majlind", 25, "Male", "MSH", "Sdet",
                'A', "Cydeo");

        student2.study();
        System.out.println(student2);


        System.out.println("------------------------------------------------------------------------------------------");


        UndergraduateStudent student3 = new UndergraduateStudent("Fitore", 23, "Female", "FIF01",
                "ComputerScience", ' ', "Cydeo");

        student3.study();
        System.out.println(student3);
    }
}
/*
4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.

 */