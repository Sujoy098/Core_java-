//class this_keyword
//{
//    void show(){
//        System.out.println(this); // method (1) this keyword o currunt object refers corche
//    }
//	public static void main(String[] args) {
//	
//		 this_keyword  r=new  this_keyword();
//	r.show();
//	System.out.println(r);
//	}
//	
//}
            //method(2) online compiler

//class A
//{
//    int a;//instance variable
//    A(int a) //local variable
//    {
//
//       this.a=a; //this keyword holo instance variable,er(.a) object part hoy
//    }
//    void show(){
//        System.out.println(a); 
//    }
//	public static void main(String[] args) {
//	
//		A r=new A(100);
//	r.show();
//
//	}
//	
//}
     // method(3) default constructor

// class A
//{
//   
//    A() //default constructor
//    {
//         System.out.println("sujoy"); 
//    }
//    A(int a){
//         this();//this keyword default constructor call corche
//        System.out.println(a); 
//    }
//	public static void main(String[] args) {
//	
//	A r=new A(100);
//
//
//	}
//	
//}
            //method(4) 1.default construct-->parameterized

class A
{
   
    A() //default constructor
    {
         this(10);
    }
    A(int a){   //parameterized constructor
       
        System.out.println(a); 
    }
	public static void main(String[] args) {
	
	A r=new A();


	}
	
}