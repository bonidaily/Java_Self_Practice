package day_04_selection_practice.selection_statemants_practice;

public class Finra {

    public static void main(String[] args) {

        int number = 15;

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("Finra");

        } else if (number % 3 == 0) {
            System.out.println("FIN");

        } else if (number % 5 == 0) {
            System.out.println("RA");

        }

    }

}

/*Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA

 */