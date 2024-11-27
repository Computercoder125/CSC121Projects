/**
 * @Author: Sean Gor
 * Date: 2/12/23
 * Assignment # #DefiningClassesII
 * Purpose: This Shoe class declares and initializes all the fields / attributes, along with the getter / setter methods.
 * For the array field, it uses deep copy to initialize all of its elements.
 * Input: None
 * Output: A String statement printing all the objects' attributes. For the like method, the updated # of likes.
 */

import java.util.Arrays;
public class Shoe
{
    private String manufacturer;

    private String name;

    private int numOfLikes;

    private double price;

    private String[] colours;

    //Empty/Default Constructor
    public Shoe()
    {
        manufacturer = "Nike";

        name = "Air Max";

        numOfLikes = 200;

        price = 86.99;

        colours = new String [] {"Black", "Blue", "Green"};
    }

    //Override Constructor
    public Shoe(String manufacturer, String name, double price, String[] colours)
    {
         this.manufacturer = manufacturer;

         this.name = name;

         this.price = price;

         numOfLikes = 0;

         //performing deep copy

         this.colours = new String[colours.length];

         for(int i = 0; i < colours.length; i++)
         {
             this.colours[i] = colours[i];
         }
    }

    //getter methods
    public String getManufacturer(){return manufacturer;}

    public String getName() {return name;}

    public double getPrice() {return price;}

    public int getNumOfLikes() {return numOfLikes;}

    public String[] getColours() {return colours;}

    //setter methods

    public void setManufacturer(String manufacturer){this.manufacturer = manufacturer;}

    public void setname(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}

    public void setNumOfLikes(int numOfLikes) {this.numOfLikes = numOfLikes;}

    public void setColours(String[] colours)
    {
        this.colours = new String[colours.length];

        for(int i = 0; i < colours.length; i++)
        {
            this.colours[i] = colours[i];
        }
    }
    public void like()
    {
        this.numOfLikes = numOfLikes + 1;

        System.out.println("The new # of likes is: " + numOfLikes);
    }

    public String toString()
    {
        return "Manufacturer: " + manufacturer + "\n" + "name: " + name
                +  "\n" +  "Price: " + price + "\n" + "Number of likes: " + numOfLikes + "\n" + "Colors: " + "\n" + Arrays.toString(colours);
    }
}