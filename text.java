//                //super keyword//
//import java.util.Scanner;
//class A  //variable same -->class
//{
//    int a=10;
//}
//class B extends A
//{
//   int a=20;
//   void show()
//   {
//       System.out.println(a);
//       System.out.print(super.a);
//   }
//}
//
//class text {
//
//	public static void main(String[] args) {
//	B obj=new B();
//	obj.show();
//		
//
//	}
//
//}



//class A
//{
//    void show()  //method name same
//   {
//       System.out.println("hellow world");
//       
//   }
//}
//class B extends A
//{
//  
//   void show()
//   {
//       super.show();
//       System.out.println("hellow viewer");
//   }
//}
//
//class text {
//
//	public static void main(String[] args) {
//	B obj=new B();
//	obj.show();
//		
//
//	}
//
//}

class A
{
    A()  //sub class -->super class ke called (automatic)
   {
       System.out.println("hellow world");
       
   }
}
class B extends A
{
  
   B()
   {
       //super.show();
       System.out.println("hellow viewer");
   }
}

class text {

	public static void main(String[] args) {
	B obj=new B();
		

	}

}