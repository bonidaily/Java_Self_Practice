package day_10_wrapper_class_arraysList;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

       String str = "Wooden Spoon123!";

        str.toCharArray();

        String letters="";
        String digits="";
        String specialCharacters="";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch))
                letters += ch;
            if (Character.isDigit(ch))
                digits += ch;
            if (!Character.isLetterOrDigit(ch))
                specialCharacters += ch;
            }
        System.out.println("letters= " + letters );
        System.out.println("Digits= " + digits);
        System.out.println("specialChars= " + specialCharacters);
        }

    }

/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

 */