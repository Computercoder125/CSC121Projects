import java.util.ArrayList;

public class accountDriver
{
    public static void main(String[] args)
    {

        //creating two objects: customer1 and customer2 of the account class and assigning them the fields
        Account customer1 = new Account("John", 3454, 654.32, Account.accType.Savings, 0);

        Account customer2 = new Account("Jack", 4543, 543.23, Account.accType.Checking, 3);

        ArrayList <Integer> ex = new ArrayList<>(); //creates an Array List of Integers

        //creating an ArrayList of the account class

        ArrayList <Account> list = new ArrayList<>();

        list.add(customer1); //adding the entire profile of customer1 object as the 1st element on list

        list.add(customer2); //adding the entire profile of customer2 object as the 2nd element on list

       // for (Account account : list)
       // {
            //System.out.println("Entire list: " + account);
       // }

        for(Account account : list)
        {
            // printing out the account object ONLY IF it has a savings account type
            if(account.getAccountType() == Account.accType.Savings)
            {
                System.out.println(account);
            }
        }
       //printing the profile of each customer

        //System.out.println(customer1);

        //System.out.println(customer2);

       //testing getter methods

       System.out.println(customer1.getAccountHolder());

       System.out.println(customer2.getAccountType()); //make reference to enum accType

        //Testing withdraw method

        System.out.println("new balance: " + customer1.withDraw( 543));

        //Testing deposit method

        customer2.deposit(654); //depositing 654 to customer 2's account

        System.out.println("New balance = " + customer2.getBalance()); //printing out customer 2's new balance

        //Testing setter methods
        customer1.setBalance(654); //setters / mutators are void methods, so they do not return anything

        customer2.setBalance(431);

    }

}
