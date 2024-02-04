package day_08_strings_methods;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = input.nextLine();

        int indexOfUnderscore = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexofDot = email.indexOf(".");

        String firstName = email.substring(0,indexOfUnderscore);
        String lastName = email.substring(indexOfUnderscore+1, indexOfAt);
        String domain = email.substring(indexOfAt +1, indexofDot);

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        domain = domain.substring(0,1).toUpperCase()+ domain.substring(1);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);








    }

}
/*
5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple

 */