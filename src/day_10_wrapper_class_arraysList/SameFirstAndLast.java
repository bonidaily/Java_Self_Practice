package day_10_wrapper_class_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {

    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(element -> element.toLowerCase().charAt(0) == element.toLowerCase().charAt(element.length()-1));
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            String word=list.get(i);
//            if(word.toLowerCase().charAt(0)==word.charAt(word.length()-1)){
//                list.remove(word);
//                i--;
//            }

        }


    }


/*
11. Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Lan", "Ebrahim", "Farida"]

 */