package day_07_class_objects;

import java.util.Scanner;

public class PlanceAndOrder {

    public static void main(String[] args) {

        Scanner product = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String productName = product.nextLine();

        System.out.println("Enter the price: ");
        double priceProduct = product.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantityProduct = product.nextInt();

        System.out.println("Enter your first name: ");
        product.nextLine();
        String userName = product.nextLine();

        double totalPrice = quantityProduct * priceProduct;

        System.out.println(userName + ", your order for " + quantityProduct + " " + productName + " has been placed." +
                " Your total is " + totalPrice);

        product.close();

    }

}
/*
10. Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.

 */