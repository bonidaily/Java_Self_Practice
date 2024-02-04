package day_08_strings_methods;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner fruits = new Scanner(System.in);

        System.out.println("Enter your first word: ");
        String firstFruit = fruits.next();

        System.out.println("Enter your second fruit: ");
        String secondFruit = fruits.next();

        System.out.println(firstFruit.substring(1) + secondFruit.substring(1));

    }

}
/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

 */