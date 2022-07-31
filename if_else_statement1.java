import java.util.Scanner;

public class if_else_statement1 {

	public static void main(String[] args) {
		int age;
		System.out.print("Enter the age: ");
		Scanner obj=new Scanner (System.in);
       age=obj.nextInt();
       if(age>18)
       {
    	   System.out.print("vot ke liye eligible hay");
       }
       else
       {
    	   System.out.print("Not eligible in vot");
       }
	}

}
