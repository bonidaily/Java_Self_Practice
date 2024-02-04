package day_09_arrays;

import java.util.Arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] classmates = {"Arbon Shehu", "Dren Riza", "Krenar Radoniqi", "Sharr Bakalli", "Agon Mati", "Ardit Zorra", "Lum Xharavina",
                "Arben Bibaj", "Besart Nikaj", "Agron Domi"};

        String[] reversedMates = new String[classmates.length];
        for (int i = 0; i < classmates.length; i++) {
            reversedMates[i] = classmates[i].substring(classmates[i].indexOf(" ")) + " " +
                    classmates[i].substring(0, classmates[i].indexOf(" "));

            System.out.println(reversedMates[i]);
        }

    }

}
/*
6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */