//synchronizing mutliple threads in java
import java.util.*;
class Account{
    private int bal;
    public Account(int bal)
    {
        this.bal=bal;
    }
    public boolean isSufficientBalance(int w)
    {
        if(bal>w)
        return true;
        else
        return false;
    }
    public void withdraw(int amt)
    {
        bal=bal-amt;
        System.out.println("Withdrawal Successful");
        System.out.println("Current balance is : "+bal);
    }
}
class Customer implements Runnable{
    private Account account;
    private String name;
    public Customer(Account account, String name)
    {
        this.account=account;
        this.name=name;
    }
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        
        synchronized(account){
        System.out.println();
        System.out.println(name+", Enter the amount to withdraw : ");
        int amt = sc.nextInt();
        if(account.isSufficientBalance(amt))
        {
            account.withdraw(amt);
        }
        else
        System.out.println("Insuffiecient balance.");
        }
    }
}

public class SynchronizeThreadExample
{
	public static void main(String[] args) {
	    Account a1 = new Account(1000);
	    Customer c1 = new Customer(a1,"Drew");
	    Customer c2 = new Customer(a1,"Andrew");
	    Thread t1 = new Thread(c1);
	    Thread t2 = new Thread(c2);
	    t1.setPriority(6);
	    t1.start();
	    t2.start();
	}
}
