import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		int num,c;
		System.out.print("Enter any number: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			c=num*i;
			System.out.println(c);
		}
	}

}
