package day_07_class_objects;

import java.util.Scanner;

public class ScannerCentToDollars {

    public static void main(String[] args) {

        Scanner centToDollars = new Scanner(System.in) ;

        System.out.println("Enter number of cents: ");
        int cent = centToDollars.nextInt();

        int dollar = (int) (cent*0.01);
        int remCents = cent % 100;

        System.out.println(cent + " cents is equal to " + dollar + " dollas and " + remCents + " cents");

        centToDollars.close();





    }

}
/*
8. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents

 */