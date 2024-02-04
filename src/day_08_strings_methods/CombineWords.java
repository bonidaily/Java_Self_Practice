package day_08_strings_methods;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter your first word: ");
        String firstWord = numbers.next();

        System.out.println("Enter your second word: ");
        String secondWord = numbers.next();


        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)) ;//if char is at the end of word is same with the first char
        {                                                                   //at second word.
            String secondWord2 = secondWord.substring(1);//then we create a new secondword2 starting from the index 1
            String result = firstWord.concat(secondWord2);
            System.out.println(result);
        }


    }

}
/*
Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */