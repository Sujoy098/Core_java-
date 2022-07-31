                    /*connstructor*/
import java.util.Scanner;
class A
{
	int a; String name;
	 A()
	{
		a=0;name=null;
	}
	void show()
	{
		System.out.print(a+" "+name);
	}
}


public class constructor {

	public static void main(String[] args) {
		A obj=new A();
		obj.show();

	}

}


