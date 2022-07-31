//interface vehical         //online compiler
//{
//	String name="TVS";//public+static+final
//	int speed=100; //public+static+final
//	
//	
//	void start();    //public+abstract
//	void stop();    //public+abstract
//	default void color()
//	{
//		System.out.println("TVS color is red");
//	}
//	static void speed()
//	{
//	   	System.out.println("TVS speed is 100km/h"); 
//	}
//}
//class customer implements vehical{
//   // @override
//	public void start()
//	{
//	    //name="Honda";  //--->final-- can'tchange
//		System.out.println("start(): insert key & press button");
//	}
////	@override
//	public void stop()
//	{
//		System.out.println("stop(): exit key");
//	}
//	public static void main(String[] args) {
//		 customer c=new  customer();
//		c.start();c.stop();c.color();
//       vehical.speed();
//       System.out.println(speed);
//	}
//
//}


//          //simpleinheritance
//class student //super class
//{
//    int roll,marks;
//    String name;
//    void input()
//    {
//        System.out.print("Enter roll name & marks: ");
//    }
//    
//}
//class ankit extends student  //sub class
//{
//    void disp()
//    {
//        roll=1;name="ankit";marks=89;
//        System.out.print(roll+" "+name+" "+marks);
//        
//    }
//    public static void main(String []args)
//    {
//        ankit r=new ankit();
//        r.input();r.disp();
//    }
//}

//          //multileval inheritance
//class A //super class
//{
//    int a,b,c;
//    void add()
//    {
//        a=10;b=20;
//        c=a+b;
//        System.out.println("sum of two number: "+c);
//    }
//    void sub()
//    {
//        a=100;b=50;
//        c=a-b;
//        System.out.println("sub of two number: "+c);
//    }
//    
//}
//class B extends A  //sub class
//{
//    void multi()
//    {
//        a=10;b=2;
//        c=a*b;
//        System.out.println("multiplication of two number: "+c);
//    }
//    void div()
//    {
//        a=10;b=2;
//        c=a/b;
//        System.out.println("division of two number: "+c);
//    }
//
//}
//class C extends B  //sub class
//{
//    void rem()
//    {
//        a=10;b=3;
//        c=a%b;
//        System.out.println("Remainder of two number: "+c);
//    }
//    void div()
//    {
//        a=10;b=2;
//        c=a/b;
//        System.out.println("division of two number: "+c);
//    }
//}
//class test  //sub class
//{
//    public static void main(String []args)
//    {
//       C r=new C();
//       r.add();r.sub();r.multi();r.div();r.rem();
//    }
//}


//          //multiple inheritance
//interface A //super class
//{
//    void show();
//}
//interface B  //sub class
//{
//   void disp(); //disp-->show change corte hobe na holo ekta clled je hobe
//  
//}
//class multiple implements A,B //sub class
//{
//   public void show()
//    {
//        System.out.println("interface & A");
//    }
//  public void disp()  //disp-->show change corte hobe
//    {
//        System.out.println("interface & B");
//    }
//   public static void main(String []args)
//    {
//       multiple m=new multiple();
//       m.show();m.disp();
//    }
//}


 
