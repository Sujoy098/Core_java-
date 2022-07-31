import java.util.Scanner;

public class if_statement {

	public static void main(String[] args) {
		int pwd;
		System.out.print("Enter the password: ");
        Scanner obj= new Scanner(System.in);
        pwd=obj.nextInt();
        if(pwd==721633)
        {
        	System.out.println("My name:sujoy");
        	System.out.println("my age:20");
        	System.out.println("My contact:7407444887");
        	System.out.print("My address:Narandari");
        }
	}

}
