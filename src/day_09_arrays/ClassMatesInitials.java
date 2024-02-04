package day_09_arrays;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Arbon Shehu","Dren Riza","Krenar Radoniqi","Sharr Bakalli","Agon Mati","Ardit Zorra","Lum Xharavina",
        "Arben Bibaj", "Besart Nikaj","Dea Xhara"};

        String[] initials = new String[classmates.length];

        for (int i = 0; i <= classmates.length-1; i++) {
            initials[i] = classmates[i].charAt(0) + "." +classmates[i].charAt(classmates[i].indexOf(" ") + 1);
            // for every iteriation we add to initials[i] the first char of classmates + the car after " ".
        }
        System.out.println(Arrays.toString(initials));
    }

}
/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */