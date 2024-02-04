package day_04_selection_practice.selection_statemants_practice;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 45;
        double n2 = 34;

        char mathOperator = '!';
        String result;

        switch (mathOperator){
            case '+':
                result = "Additon " + (n1+n2);
                break;
            case '-':
                result = "substract " + (n1-n2);
                break;
            case '*':
                result = "multiplication " + (n1*n2);
                break;
            case '/':
                result = "divide " + (n1/n2);
                break;
            default:
                result = "invalid operator";
        }
        System.out.println(result);
    }

}
/*
10. Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		For any other operators, print "invalid operator."

            Example:
                  n1 = 10, n2 = 20, mathOperator = '+'

            Output:
                  30

 */