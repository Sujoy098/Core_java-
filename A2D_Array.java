import java.util.Arrays;
import java.util.Scanner;

public class A2D_Array {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		System.out.print("Enter array element: ");
		Scanner obj=new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{ 
			for(int j=0;j<2;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		//Arrays.sort(a);
		System.out.print("\nArray element: \n");
		for(int i=0;i<2;i++)
		{ 
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
