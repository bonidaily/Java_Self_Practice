package day_10_wrapper_class_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

//        list.removeIf(character -> list.indexOf(character) != list.lastIndexOf(character));
//        System.out.println(list);

        list.removeIf(character -> list.indexOf(character) != list.lastIndexOf(character));
       /*
        When character is '1':
        list.indexOf(character) != list.lastIndexOf(character)
        0 != 1
        This condition evaluates to true.
        This means that for the element '1', the condition list.indexOf(character) != list.lastIndexOf(character) is true.
        This indicates that there are multiple occurrences of '1' in the list, with different indexes.
        As a result, the removeIf method will remove one of these occurrences to ensure uniqueness.
        */
        System.out.println(list);


    }
}
/*
9. Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]
 */
