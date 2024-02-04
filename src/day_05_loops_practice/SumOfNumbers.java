package day_05_loops_practice;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum =0;

        for (int num1 = 0; num1 <= 50 ; num1++) {
            sum += num1;
        }
        System.out.println("the sum is: " + sum);

    }

}
/*
4. Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275

 */