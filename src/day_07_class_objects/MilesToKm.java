package day_07_class_objects;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        Scanner milesTokm = new Scanner(System.in);// milesToKom osht objekti qe e krijojim ne klassen Scanner

        System.out.println("Enter the miles: ");
        double miles = milesTokm.nextDouble(); // miles osht instanca variable qe e perdorim per mi rujt inputin e userit

        double km = miles * 1.609;

        System.out.println(miles + " miles is equal to " + km + " kilometers");

        System.out.println("------------------------------------------------------------");



    }

}
/*
9. Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
convert it to kilometers.

        Example:
             Enter the miles:
             Input: 10.0

        Output:
             10.0 miles is equal to 16.09 kilometers

 */