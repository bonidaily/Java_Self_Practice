package day_04_selection_practice.selection_statemants_practice;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeLevel = 16;
        String result;
        if (gradeLevel == 1 && gradeLevel <= 5){
            result = "Elementary school";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            result = "Middle School";
        } else if (gradeLevel >= 9 && gradeLevel <= 12 ) {
            result = "high school";
        } else if (gradeLevel >=13 && gradeLevel <= 16) {
            result = "college";
        } else if (gradeLevel >= 17 && gradeLevel == 18) {
            result = "Grad school";
        }else {
            result = " Invalid Grade Level";
        }
        System.out.println(result);
    }

}
/*
6. Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
				  c
 */
