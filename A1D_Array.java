import java.util.Arrays;
import java.util.Scanner;

public class A1D_Array {

	public static void main(String[] args) {
		
		
//		int a[]= {10,20,30,40,50};//int[5]
//		
////	 System.out.println(a[2]);
////	 System.out.print(a[3]);
//		for(int b:a)     //for each loop
//		{
//		   System.out.print(b+" ");
//		}
		int a[]=new int[5];
		System.out.print("Enter array element: ");
		Scanner obj=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			a[i]=obj.nextInt();
		}
		Arrays.sort(a);
		System.out.print("\nArray element: ");
		for(int b:a)
		{
			System.out.print(b+" ");
		}
   }
	

}
