import java.util.Scanner;
abstract class Bank
{
	public  String name="myBank";
	public String IFSC="721633";
	
	public void bankDetail()
	{
		System.out.println("Bank name: "+name+"; "+"Bank IFSC: "+IFSC);
	}
	abstract void Deposite();
	abstract void withdraw();
	abstract void checkbalance();
}
class bankSerivce extends Bank
{
	private double bal=5000;
	private int password;
	public double money;
	
	public void Deposite()
	{
		System.out.println("Enter your password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{

			System.out.println("Enter your Deposite amount: ");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("Deposite: "+money);
			System.out.println("total balance: "+bal);
		}
		else
		{
			System.out.println("incorrect password...!");
		}
	}
	public void withdraw()
	{
		System.out.print("Enter your password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			System.out.println("Enter your withdraw amount: ");
			money=s.nextDouble();
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


public class Abstraction {

	public static void main(String[] args) {
		
		 
		bankSerivce b=new bankSerivce();
		  b.bankDetail();
			int ch;
			System.out.println("1.Deposite: ");
			System.out.println("2.withdraw: ");
			System.out.println("3.checkbalance: ");
			
			
			System.out.print("\nEnter your choice: ");
			Scanner s2=new Scanner(System.in);
	        ch=s2.nextInt();
	        switch(ch)
	        {
	        case 1:b.Deposite();
	        break;
	        case 2:b.withdraw();
	        break;
	        case 3:b.checkbalance();
	        break;
	        default:
	        	System.out.print("invalid choice");
	        }
		}
	

}
