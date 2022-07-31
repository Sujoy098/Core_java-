
public class opareter {

	public static void main(String[] args) {
		int a=10,b=50,c=30;
//		System.out.println(a--);//10--->9
//		System.out.println(--a);//8
//		System.out.println(a++);//8--->9
//		System.out.println(++a);//10
		int r=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.print(r);
	}

}
