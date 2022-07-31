import java.util.Scanner;

public class while_loop_even_and_odd {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter the any number: ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		
		while(num>0)
		{
		   if(num%2==0)
		   {
			   System.out.print("Even Number");
			   break;
		   }
		   else
		   {
			   System.out.print("Odd Number");
			    break;
		   }
		}
	}
}
