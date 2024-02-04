package day_04_selection_practice.selection_statemants_practice;

public class GreetingHours {

    public static void main(String[] args) {

    int hours = 23;

    if(hours >= 0 && hours <=22){
        if (hours > 6 && hours <12 ){
            System.out.println("Good morning");
        } else if ( hours < 15) {
            System.out.println("good afternon");
        }else {
            System.out.println("good afternon");
        }
    }else {
        System.out.println("This is an invalid hours");
    }

    }

}
//Write a program using nested if which prints greeting words for a given
//hour with a 24-hour clock system.
//
//If an hour is after 6 but before 12 noon, greet with Good Morning
//
//If an hour is after 12 noon but before 15, greet with Good Afternoon
//
//If an hour is after 15 but before 22, greet with Good Evening
//Input:
//hour = 14