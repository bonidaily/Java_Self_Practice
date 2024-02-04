package day_04_selection_practice.selection_statemants_practice;

public class Revenue {

    public static void main(String[] args) {

        double price = 1500;
        double quantity = 4;

        double revenue = price * quantity;
        double discount = revenue / 10;
        double netRevenue = revenue - discount;

        if (revenue > 5000){
            System.out.println("Discount: " + discount);
            System.out.println("Net Revenue " + netRevenue);
            }else {
            System.out.println("Revenue: " + revenue);
        }


    }

}
//Write a program that calculates the revenue for a given product price
//and quantity.
//
//The program should apply a 10% discount if the revenue is more than 5000, and
//displays the discount and net revenue:
//
//revenue = price × quantity.