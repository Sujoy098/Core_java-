import java.util.Scanner;
class A
{
	int a;String b;boolean c;
	A()
	{
	   a=100;b="sujoy";c=true;	
	}
	void show()
	{
		System.out.print(a+" "+b+" "+c);
		
	}
}
class B {

	public static void main(String[] args) {
		A r=new A();
		r.show();
	}

}