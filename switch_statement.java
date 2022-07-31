import java.util.Scanner;

public class switch_statement {

	public static void main(String[] args) {
		int a,b,ch,c;
		System.out.print("Enter the two number: ");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.print("Enter your choice: ");
	    ch=obj.nextInt();
	    switch(ch)
	    {
	       case 1: c=a+b;
	       System.out.print("addition "+c);
	       break;
	       case 2: c=a-b;
	       System.out.print("substraction "+c);
	       break;
	       case 3: c=a*b;
	       System.out.print("multiplication "+c);
	       break;
	       case 4: c=a/b;
	       System.out.print("divition "+c);
	       break;
	       case 5: c=a%b;
	       System.out.print("Rimainder "+c);
	       break;
	      default:
	    	  System.out.print("invalid choice");
	    }

	}

}
