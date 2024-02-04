package day_04_selection_practice.selection_statemants_practice;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 11;

        switch (month) {
            case 1 -> {
                System.out.println("Month:January");
                System.out.println("Days:31");
            }
            case 2 -> {
                System.out.println("February");
                System.out.println("Days:28 ");
            }
            case 3 -> {
                System.out.println("March");
                System.out.println("Days:31");
            }
            case 4 -> {
                System.out.println("April");
                System.out.println("Days:30");
            }
            case 5 -> {
                System.out.println("May");
                System.out.println("Days:31");
            }
            case 6 -> {
                System.out.println("June");
                System.out.println("Days:30");
            }
            case 7 -> {
                System.out.println("July");
                System.out.println("days:31");
            }
            case 8 -> {
                System.out.println("August");
                System.out.println("Days:31");
            }
            case 9 -> {
                System.out.println("September");
                System.out.println("Days 30");
            }
            case 10 -> {
                System.out.println("October");
                System.out.println("31 days");
            }
            case 11 -> {
                System.out.println("November");
                System.out.println("30 days");
            }
            case 12 -> {
                System.out.println("December");
                System.out.println("31 days");
            }
            default -> System.out.println("Invalid");


        }


    }
}
/*Create a class named NumberOfDays. An integer variable named month is given.
	Write a program to determine the number of days in a given month.

			Example:
				   month = 5

			Output:
				   31 days

			(Assume that February has 28 days)

		If the given month number is not between 1~12, then print "Invalid."

		Hints:
			Months with 31 days: 1, 3, 5, 7, 8, 10, 12
			Months with 30 days: 4, 6, 9, 11


 */