import java.util.Scanner;

public class if_else_ladder_statement {

	public static void main(String[] args) {
		int marks;
		System.out.print("Enter your marks: ");
		Scanner obj =new Scanner(System.in);
		marks=obj.nextInt();
	
		if(marks>=80 && marks<=100)
		{
			System.out.print("very good result");
		}
		else if(marks>=60 && marks<80)
		{
			System.out.print("good result");
		}
		else if(marks>=40 && marks<60)
		{
			System.out.print("pass");
		}
		else
		{
			System.out.print("so sad failed");
		}
	}

}
