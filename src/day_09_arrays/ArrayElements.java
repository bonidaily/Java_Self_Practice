package day_09_arrays;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {


        int[] numbers = new int[100];// array of integers with length of 100;

        for (int i = 0; i < numbers.length; i++) {// fori loop to start assign number to array number[i]. for every iteriation
            numbers[i] = i + 1;                   // we add +1 to number [i]
        }
        System.out.print(Arrays.toString(numbers));

        System.out.println("----------------------------------------------------------------------------------");

        int[] reverseNumber = new int[numbers.length];// we create an array reverseNumber to hold the same amount of number as number length

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {// for i which start at number 100 we add to reversenumber[j] every iteriation
            reverseNumber[j] = numbers[i];              // as long as i >=0 we continue to add the value to reverseNumber;

        }
        System.out.print(Arrays.toString(reverseNumber));

        System.out.println();

        for (int number : numbers) {
            if(number % 5 == 0){
                System.out.print( number + " ");;
            }
        }


    }
}

/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.

 */