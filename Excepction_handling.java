//        //Excepction
//class test
//{
//     public static void main(String []args)
//    {
//       System.out.println("Main method started");
//     int a=10,b=0,c;
//     c=a/b;
//     System.out.print(c);
//     System.out.println("Main method ended");
//    }
//}

        //Exception handling
class test
{
     public static void main(String []args)
    {
       System.out.println("Main method started");
       int a=10,b=0,c;
       try
       {
           c=a/b;
           System.out.print(c);
       }
       catch(Exception e)
       {
            System.out.println(e);//("can't deviedby zero");
       }
        System.out.println("Main method ended");
    }
}