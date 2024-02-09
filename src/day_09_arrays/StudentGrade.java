package day_09_arrays;

import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[scores.length];//here we create a char array with the same length as scores array

        for (int i = 0; i < scores.length; i++) {//here we take every element from scores array and check what number is
            if (scores[i] > 100 || scores[i] < 0) {//if the number is greater than 100 or smaller than zero, we return nothing
                return;
            }
            if (scores[i] > 89) grades[i] = 'A';// if the number is geater than 89, we assign grade 'A' to first element in array grades
            else if (scores[i] > 79) grades[i] = 'B';//same we do here with grade B
            else if (scores[i] > 69) grades[i] = 'C';//same with grade C
            else if (scores[i] > 59) grades[i] = 'D';//same with grade D
            else grades[i] = 'F';//for every other between zero and 59 we rreturn 'F'
        }
        System.out.println("Grades: " + Arrays.toString(grades));

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }//here for every element in names array we print its name,scores and grade

    }


}
/*
4. Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B

 */