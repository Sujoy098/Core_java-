import java.util.Scanner;

class bank
{
	private double bal=5000;
	private int password;
	
	public void Deposite(double money)
	{
		System.out.println("Enter your password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			bal=bal+money;
			System.out.println("Deposite: "+money);
			System.out.println("total balance: "+bal);
		}
		else
		{
			System.out.println("incorrect password...!");
		}
	}
	public void withdraw(double money)
	{
		System.out.print("Enter your password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			bal=bal-money;
			System.out.println("withdraw: "+money);
			System.out.println("total balance: "+bal);
		}
		else
		{
			System.out.println("incorrect password...!");
		}
	}
	public void checkbalance()
	{
		System.out.print("Enter your password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			System.out.println("total balance: "+bal);
		}
		else
		{
			System.out.println("incorrect password...!");
		}
	}
	
}
public class encapsulation {

	public static void main(String[] args) {
		bank b=new bank();
		int ch;
		System.out.println("1.Deposite: ");
		System.out.println("2.withdraw: ");
		System.out.println("3.checkbalance: ");
		
		
		System.out.print("\nEnter your choice: ");
		Scanner s2=new Scanner(System.in);
        ch=s2.nextInt();
        switch(ch)
        {
        case 1:b.Deposite(1500);
        break;
        case 2:b.withdraw(1000);
        break;
        case 3:b.checkbalance();
        break;
        default:
        	System.out.print("invalid choice");
        }
	}

}
