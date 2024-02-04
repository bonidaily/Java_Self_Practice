package day_06_methods;

import com.sun.source.tree.BreakTree;

public class DayAndMonth {

    public static void main(String[] args) {

        System.out.println(dayName(6));

    }

    public static String dayName(int dayNumber) {


        String result;
        if (dayNumber == 1) {
            result = "Monday";
        } else if (dayNumber == 2) {
            result = "Tueday";
        } else if (dayNumber == 3) {
            result = "Wednesday";
        } else if (dayNumber == 4) {
            result = "Thursday";
        } else if (dayNumber == 5) {
            result = "Friday";
        } else if (dayNumber == 6) {
            result = "Saturday";
        } else if (dayNumber == 7) {
            result = "Sunday";
        } else {
            result = "Number is invalid";
        }
        return result;

    }

}


/* if (dayNumber < 1 && dayNumber > 7) {
            return "Invalid Number";
            if (dayNumber == 1) {
                return "Monday";
            }
            if (dayNumber == 2) {
                return "Tuesday";
            }
            if (dayNumber == 3) {
                return "Wednesday";
            }
            if (dayNumber == 4) {
                return "Thursday";
            }
            if (dayNumber == 5) {
                return "Friday";
            }
            if (dayNumber == 6) {
                return "Saturday";
            }
            if (dayNumber == 7) {
                return "Sunday";
            }
        }

 */

/*
3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday
 */