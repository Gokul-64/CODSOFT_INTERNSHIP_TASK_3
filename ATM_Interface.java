package task3;
import java.util.*;
class Account 
{
    private double balance;
    public Account(double initialBalance) 
    {
        balance = initialBalance;
    }
    public String deposit(double amount) 
    {
        if (amount <= 0) 
              return "Deposit amount must be greater than zero.";
        balance += amount;
        return "Amount Deposited Successfully..\nCurrent Balance: "+balance;
    }

    public String withdraw(double amount) 
    {
        if (amount <= 0) 
            return "Withdrawal amount must be greater than zero.";
        if (amount > balance)
            return "Insufficient balance! ";
        balance -= amount;
        return "Amount Withdrawed Successfully..\nCurrent Balance: "+balance;
    }

    public String checkBalance() 
    {
        return "Current balance: " + balance;
    }
}
class ATM
{
	Account b=new Account(1000);
	public void start()
	{
		Scanner s=new Scanner(System.in);
		int loop=1;
		do
		{
			System.out.println("~~~~~WELCOME TO PRO\'s BANK~~~~~");
			System.out.println("Choose an Option to be done:\n1.Withdrawing\n2.Depositing\n3.Check Balance");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Enter the Amount to Withdraw: ");
				int amnt=s.nextInt();
				System.out.println(b.withdraw(amnt));
				break;
			case 2:
				System.out.print("Enter the Amount to Deposit: ");
				int amt=s.nextInt();
				System.out.println(b.deposit(amt));
				break;
			case 3:
				System.out.println(b.checkBalance());
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			System.out.println("Enter 1 to continue");
			loop=s.nextInt();
		}while(loop==1);
	}
}
public class ATM_Interface {
	public static void main(String[] args) {
		
		ATM a=new ATM();
		a.start();
	}
}
