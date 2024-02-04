package day_07_class_objects;

import java.util.Scanner;

public class ScannerGradeReport {

    public static void main(String[] args) {

        Scanner score = new Scanner(System.in);

        System.out.println("Enter your grade score: ");
        int gradeScore = score.nextInt();

        if (gradeScore < 1 || gradeScore > 100) {
            System.err.println("Invalid Score");

        } else if (gradeScore >89) {
            System.out.println("Your grade is A");
        } else if (gradeScore >79) {
            System.out.println("Your Grade is B");
        } else if (gradeScore > 69) {
            System.out.println("Your Grade is C");
        } else if (gradeScore>59) {
            System.out.println("Your Grade is D");
        }else {
            System.out.println("Your Grade is F");
        }
        score.close();
    }

}
/*
7. Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B

 */