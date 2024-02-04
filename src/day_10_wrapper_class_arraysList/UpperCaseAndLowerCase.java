package day_10_wrapper_class_arraysList;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

       String str = "JAVA java";

       str.toCharArray();
        int count = 0;
        int count1 = 0;
        boolean result;

        for (char c : str.toCharArray()) {
            if(Character.isLowerCase(c)){
                 count++;
            }else if(Character.isUpperCase(c)){
                count1++;
            }
        }
        if(count1 == count) result=true;
        else result=false;
        System.out.println(result);

    }

}
/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true

 */