package Demoniti;

class DemonetizationException extends Exception
{
    DemonetizationException(int amount)
    {
        super("deposit of old currency of Rs."+ amount + " crosses Rs.5000");
    }
}
class account
{
    int balance;
    account()
    {
        balance=500;
    }
    void deposit(int amount,String currencyType)
    {
        try
        {
            if(currencyType.equalsIgnoreCase("old") && amount>5000)
            {
                throw new DemonetizationException(amount);
            }
            else
            {
                balance+=amount;
                System.out.println("Deposit Successful!");
            }
        }
        catch (DemonetizationException e)
        {
            System.out.println(e.getMessage());
        }
    }
    void CurrBalance()
    {
        System.out.println("The current balance is Rs."+balance);
    }
    void withdraw(int amount)
    {
        if(balance-amount<500)
        {
            System.out.println("Withdrawal failed! Balance should not go below 500");
        }
        else
        {
            balance-=amount;
            System.out.println("Withdrawal Successful");
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        account ac=new account();
        ac.deposit(400,"old");
        ac.withdraw(300);
        ac.CurrBalance();
        ac.deposit(6000,"old");
        ac.withdraw(7000);
    }
}
