package day_04_selection_practice.selection_statemants_practice;

public class Grade3 {

    public static void main(String[] args) {
//
        int score = -1;

        if (score >= 0 && score <= 100) {
            if (score < 60) {
                System.out.println("Fail");
            } else if (score < 90) {
                System.out.println("pass");
            } else if (score <= 100) {
                System.out.println("Passed with Distinction");
            }
        } else {
            System.out.println("invalidwd");
        }

    }
}


//Write a program using nested if evaluates the given score.
//
//If a score is less than 60, then print “Fail”
//
//If a score is greater or equal to 60, but less than 90, then print “Pass”
//
//If a score is greater or equal to 90, then print “Passed with Distinction”
//
//If a score is not between 0 and 100, then print “Invalid score”


// if (score < 60) {
////                System.out.println("Fail");
////            } else if (score < 90) {
////                System.out.println("pass");
////
////            } else if (score <= 100) {
////                System.out.println("Passed with Distinction");