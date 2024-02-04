package day_08_strings_methods;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = input.nextLine();
        String email1 ="";
        if (email.contains("_")) {// we check if email contains "_"
            int indexOfUnderscore = email.indexOf("_"); //we initialize the index of "_" to int indexOfUnderscore
            int indexOfAt = email.indexOf("@");// we initialize the index of "@" to int indexOfAt
            String firstName = email.substring(0, indexOfUnderscore); // we found firstname from email 0 until "_" dmth indexofunderscore
            String lastName = email.substring(indexOfUnderscore + 1, indexOfAt);//we found lastname from email, ("_" indexofunderscore +1) , until @
            email1 = lastName + "_" + firstName + email.substring(indexOfAt); //we initialize lastname and first name to email1
        }else {
            System.out.println(email);
        }
        System.out.println(email1);
    }

}
/*
Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com

 */