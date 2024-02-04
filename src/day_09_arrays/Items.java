package day_09_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Items {

    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("The index number of Gloves in array is: " + Arrays.binarySearch(items, "Gloves"));

        boolean result = false;
        for (String item : items) {
            if (item.contains("iPad")) {
                result = true;
            }
        }System.out.println("Is ipad on the list: " + result);

        for (int i = 0; i <items.length ; i++) {
            System.out.println((items[i]) + " - " + prices[i] + " - #" + itemIDs[i]);
        }

    }
}
/*
5. 5. Create a class named Items and write a program with the following specifications:
	5.1 Given arrays with the same length:
		String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
		int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID

 */