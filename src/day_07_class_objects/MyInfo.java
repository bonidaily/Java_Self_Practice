package day_07_class_objects;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner userInfo = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = userInfo.nextInt();

        System.out.println("Enter your gender: ");
        char gender = userInfo.next().charAt(0);

        userInfo.nextLine();

        System.out.println("Enter your full name ");
        String fullName = userInfo.nextLine();

        System.out.println("Enter your full number: ");
        long fullnumber = userInfo.nextLong();

        System.out.println("Enter your Zip Code: ");
        int zipCode = userInfo.nextInt();

        userInfo.nextLine();

        System.out.println("Enter your School name: ");
        String schoolName = userInfo.nextLine();


        System.out.println("Enter your city name: ");
        String cityName = userInfo.nextLine();


        System.out.println("Enter your state name ");
        String stateName = userInfo.next();

        System.out.println("Enter your building number: ");
        double buildingNum = userInfo.nextDouble();

        userInfo.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = userInfo.nextLine();

        System.out.println("Full Number: " + fullnumber);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Full Number: " +fullnumber);
        System.out.println("Addres: ");
        System.out.println("\t\t" + buildingNum + " " + streetName);
        System.out.println("\t\t" + cityName + ", " + stateName + " " + zipCode);

        userInfo.close();





    }

}

/*
11. Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode

 */