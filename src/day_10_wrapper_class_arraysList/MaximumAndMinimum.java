package day_10_wrapper_class_arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int minNumber = Collections.min(list);
        int maxNumber = Collections.max(list);

        System.out.println("Maximum number is " + maxNumber);
        System.out.println("Minimum number is " +minNumber);
    }

}
/*
7. Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1

 */