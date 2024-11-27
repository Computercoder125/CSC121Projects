/**
 * Author: Sean Gor
 * Date: 2/12/23
 * Assignment #DefiningClassesII
 * Purpose: This class initializes three objects of the Shoe class with its attributes, puts them in an array list, and then displays them.
 * Input: The attributes of each shoe object (in-program)
 * Output: The results of certain getter and setter methods, along with each shoe and its attributes
 */

import java.util.ArrayList;

public class ShoeDriver
{
    public static void main(String[] args)
    {
        Shoe shoe1 = new Shoe("Adidas", "Now", 90.99,  new String[]{"Yellow", "Orange"});

        Shoe shoe2 = new Shoe(); //making this object from the empty constructor

        Shoe shoe3 = new Shoe("Under Armour", "Max", 115.99, new String[]{"White", "Red"});

        ArrayList<Shoe> shoes = new ArrayList<>();

        shoes.add(shoe1);

        shoes.add(shoe2);

        shoes.add(shoe3);

        //getter method

        System.out.println("Getter method result: ");

        System.out.println("Name: " + shoe1.getName());

        shoe2.setPrice(123.32); //will print out new price during looping of the Array List containing the shoes

        //liking two pairs of shoes: shoe 1 and shoe 3

        shoe1.like();

        shoe3.like();

       //printing out all shoes in the list

        System.out.println("-------List of shoes--------");

        for(Shoe i : shoes)
        {
            System.out.println("THIS SHOE");
            System.out.println(i);
        }
    }
}
