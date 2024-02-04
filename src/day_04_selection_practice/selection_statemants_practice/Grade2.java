package day_04_selection_practice.selection_statemants_practice;


public class Grade2 {
    public static void main(String[] args) {

        char grade = 'B';

        String result;
        switch (grade) {
            case 'A': {
                result = "Excellet";
                break;
            }
            case 'B': {
                result = "Great Job";
                break;
            }
            case 'C': {
                result = "Good";
                break;
            }
            case 'D': {
                result = "passed";
                break;
            }
            case 'F': {
                result = "failed";
                break;
            }
            default: {
                result = "Invalid grade";
            }

        }
        System.out.println(result);
    }
}
/*

5. Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				  Great job

 */