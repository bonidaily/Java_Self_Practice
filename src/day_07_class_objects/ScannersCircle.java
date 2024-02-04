package day_07_class_objects;

import java.util.Scanner;

public class ScannersCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int radius = input.nextInt();

        double areaCircle = 3.14 * (radius*radius);
        double perimeterOfCircle = 2 * 3.14 * radius;
         //perimeterOfCircle = Math.round(perimeterOfCircle);


        System.out.println(" The area of the Circle is " + areaCircle);
        System.out.println("The perimeter of the Circle is " + perimeterOfCircle);

        input.close();

    }

}
//6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
//the area and perimeter of the Circle.
//
//        Example:
//             Enter the radius:
//             Input: 5
//
//        Output:
//             The area of the Circle is 78.5
//             The perimeter of the Circle is 31.4