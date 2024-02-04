package day_10_wrapper_class_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {

    public static void main(String[] args) {

        ArrayList<Character>list = new ArrayList<>
                (Arrays.asList('$','A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        list.removeIf(character -> Character.isLetter(character));

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("\'" + list.get(i) + "\'");
            if(i < list.size()-1){
                System.out.print(",");
            }
        }
        System.out.println("]");


    }

}
/*
10. Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']

 */