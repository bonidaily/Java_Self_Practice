package day_04_selection_practice.selection_statemants_practice;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        String result;
        if (a >= c) {
            result = "invalid";
        } else if (b >= a && b <= 20) {
            result = b + " is the median number";
        } else {
            result = "invalid";
        }

        System.out.println(result);

    }
}
/*
4. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number


 */





