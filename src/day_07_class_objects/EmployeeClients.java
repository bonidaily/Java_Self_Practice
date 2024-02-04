package day_07_class_objects;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Arbon Shehu";
        employee1.age = 30;
        employee1.gender = 'M';
        employee1.jobTitle = "Software Developer";
        employee1.salary = 3000;

        employee1.work();

        System.out.println(employee1);

    }

}
