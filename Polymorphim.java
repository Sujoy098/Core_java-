//          //Compile time polymorphism--method overloading
//class A 
//{
//    void add()
//    {
//        int a=10,b=20,c;
//        c=a+b;
//        System.out.println(c);
//    }
//   void add(int x,int y)
//    {
//        int c;
//        c=x+y;
//        System.out.println(c);
//    }
//     void add(int x,double y)
//    {
//        double c;
//        c=x+y;
//        System.out.println(c);
//    }
//    public static void main(String []args)
//    {
//       A r=new A ();
//     r.add(); r.add(100,200); r.add(100,36.12);
//    }
//    
//}

          //run time polymorphism--method overloading
class shape 
{
    void draw()
    {
      
        System.out.println("can't say shape type");
    }
    
}
class square extends shape
{
    void draw()
    {
        //super.draw(); // super class called corte chaile
        System.out.println("square shape");
    }
}
class demo
{
     public static void main(String []args)
    {
       square r=new square ();
     r.draw(); 
    }
}