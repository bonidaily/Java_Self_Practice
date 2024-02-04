package day_08_strings_methods;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner inputWord = new Scanner(System.in);

        String word = inputWord.next();

        if(word.startsWith("x") && word.endsWith("x")){
            word = word.replaceFirst("x", "a");
            //System.out.println(word.substring(1,word.length()-1));
            System.out.println(word);
        }else{
            System.out.println(word);
        }
    }
}




/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex

 */