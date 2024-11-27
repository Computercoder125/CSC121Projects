/**
 * @Author: Sean Gor
 * Date: 2/19/23
 * Assignment #HashMapPart2
 * Purpose: This program asks the user for their size of pizza, and then if they want to add on toppings (if any). It increments the price based on the size / toppings.
 * Input: The pizza size and potential toppings entered externally by the user.
 * Output: The total price with and without tax, double value, and rounded to the nearest hundredth.
 */

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class CSCIIPizzaAssignment
{
    public static void main(String[] args)
    {
        HashMap<String, Double> pizza = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        DecimalFormat formatter = new DecimalFormat(".00");

        //putting sizes and their corresponding prices into a dictionary

        pizza.put("Small", 8.99);

        pizza.put("Medium", 11.9);

        pizza.put("Large", 14.76);

        pizza.put("XLarge", 18.9);

        String size = "";

        double price = 0;

        //getting a pizza size from the user
        do
        {
            System.out.println("Enter a pizza size: ");

            size = sc.nextLine();

        } while (!pizza.containsKey(size));

        price += pizza.get(size);

        System.out.println("Base price = " + price);

        while (true) {

            double mushroomPrice = 3.99;

            double peppersPrice = 2.99;

            double extraCheesePrice = 3.00;

            System.out.println("Mushrooms Yes or No?");

            String mushrooms = sc.nextLine();

            while (!mushrooms.equals("yes") || !mushrooms.equals("no"))
            {
                System.out.println("Did not understand your choice. Mushrooms yes or no?");
            }

            if (mushrooms.equalsIgnoreCase("Yes"))
            {
                price += mushroomPrice;

                System.out.println("Update price: " + formatter.format(price));
            }

            System.out.println("Extra cheese? Enter 'cheese' for yes.");

            String cheese = sc.nextLine();

            if (cheese.equalsIgnoreCase("cheese"))
            {
                price += extraCheesePrice;

                System.out.println("Update price: " + formatter.format(price));
            }

            System.out.println("Peppers? Enter 'peppers' for yes.");

            String peppers = sc.nextLine();

                if (peppers.equalsIgnoreCase("peppers"))
                {
                    price += peppersPrice;

                    System.out.println("Update price: " + formatter.format(price));
                }

            System.out.println("Want more toppings 'yes' or 'no'?");

            String response = sc.nextLine();

            if (!response.equalsIgnoreCase("yes")) break;

        }
        //printing out papers

        System.out.println("Subtotal = " + formatter.format(price));

        System.out.println("Tax = 8 %. So the total price = " + formatter.format((price * 1.08)));


    }
}