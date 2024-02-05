package day_11_custom_class_part2;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee = new Employee("John",25,'M',"Developer",3000);
        System.out.println("employee3 = " + employee);

        Employee employee1 = new Employee("Arbon",30,'M',"Tester", 2500);
        System.out.println("employee4 = " + employee1);

        Employee employee2 = new Employee("Henry",3000,"Doctor");
        System.out.println("employee2 = " + employee2);
    }

}
