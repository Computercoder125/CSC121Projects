import javax.print.attribute.standard.OrientationRequested;

public class Account
{
    //creating private variables in order to keep variables from being changed to unwanted variables
    private String accountHolder;

    private double accNum;

    private double balance;


    //OR
    enum accType //accType can ONLY have values stored WITHIN the class body
    {
        Checking,
        Savings
    }

    private accType type; //declaring a field named type from the acctype enum
    private double interest;

    public Account(String accountHolder, double accNum, double balance, accType type, double interest)
    {
        this.accountHolder = accountHolder;
        this.accNum = accNum;
        this.balance = balance;
        this.type = type;
        this.interest = interest;

    }
    public String getAccountHolder()
    {
        return accountHolder;
    }
    public double getAccountNumber() { return accNum; }

    public double getBalance()
    {
        if(type.equals("savings"))
        {
            return balance + (balance * interest); //because a person under a savings account has an interest
        }
        else
        {
            return balance;
        }
    }
    public accType getAccountType()
    {
        return type;
    }
    public double getInterest()
    {
        return interest;
    }

    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(double accNum)
    {
        this.accNum = accNum;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    //public void setAccountType(accType accType) //can't set acc
    {
        this.type = type;
    }

    public void setInterest(double interest)
    {
        this.interest = interest;
    }

    public String toString()
    {
        return "Account info: " + "\n" + "Name of holder: " + accountHolder
                + "\n" + "Number: " + accNum + "\n" + "Balance: " + balance +
                "\n" + "Type: " + type + "\n" + "interest: " + interest;
    }

    public double withDraw(double amt) {return balance - amt;}

    public void deposit(double amt) {balance += amt; } //setting
}
