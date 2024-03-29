package day_10_wrapper_class_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

       String[] arr1 = {"A","B","C"};
        String[] arr2 = {"D","E","F","G"};

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        list1.addAll(list2);//added all elements of list2 to list1

        System.out.print("list ==> {" );

        for (int i = 0; i < list1.size(); i++) {// we take every element of list1
            System.out.print("\"" + list1.get(i) + "\"");//list1.get(i) it gets every element one by one
            if(i < list1.size()-1){//for every element that is smaller than list1.size-1 we add (,)
                System.out.print(",");
            }
        }
        System.out.print("}");







    }

}
/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

               Example:
                    arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */