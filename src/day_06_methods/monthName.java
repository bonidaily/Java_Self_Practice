package day_06_methods;

import java.beans.PropertyEditorSupport;

public class monthName {

    public static void main(String[] args) {

        System.out.println(monthName(13));

    }

    public static String monthName(int month) {

        String monthname = (month == 1) ? "January" : (month == 2) ? "February" : (month == 3) ? "Mars" :
                (month == 4) ? "April" : (month == 5) ? "May" : (month == 6) ? "June" : (month == 7) ? "July" :
                        (month == 8) ? "August" : (month == 9) ? "September" : (month == 10) ? "October" : (month == 11) ? "November" :
                                (month == 12) ? "December" : "Invalid";
        return monthname;
    }
}
/*
 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June
 */