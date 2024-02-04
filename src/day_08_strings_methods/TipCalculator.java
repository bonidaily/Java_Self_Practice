package day_08_strings_methods;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Split or No Split: ");
        String split = input.next();

        System.out.println("Enter the number of people: ");
        int numberPeople = input.nextInt();

        System.out.println("Enter the check amount: ");
        int check = input.nextInt();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor) ");
        String serviceQuality = input.next();

        input.close();

        double tipPercentage = 0;
        if (serviceQuality.equals("Poor")) {
            tipPercentage = 0.5;
        } else if (serviceQuality.equals("Fair")) {
            tipPercentage = 0.10;
        } else if (serviceQuality.equals("Good")) {
           tipPercentage = 0.15;
        } else if (serviceQuality.equals("Great")) {
            tipPercentage = 0.20;
        } else if (serviceQuality.equals("Excellent")) {
            tipPercentage = 0.25;
        }

        double totalTip = check * tipPercentage;
        double totalToPay = check + totalTip;
        double totalPerPerson = totalToPay / numberPeople;
        double tipPerPerson = totalTip / numberPeople;

        System.out.println("Number of people: " + numberPeople);
        System.out.println("Total Pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);


        if (split.equals("Yes")) {
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);
        }



    }
}
/*
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */