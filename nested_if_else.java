
public class nested_if_else {

	public static void main(String[] args) {
		int num1=10,num2=41,num3=50;
		if(num1>num2)
		{
			if(num1>num3) 
			{
				System.out.print("maximin number: "+num1);
			}
			else
			{
				System.out.print("maximin number: "+num3);
			}
		}
		else {
			if(num2>num3)
			{
				System.out.print("maximin number: "+num2);
			}
			else
			{
				System.out.print("maximin number: "+num3);
			}
		}
	}

}
