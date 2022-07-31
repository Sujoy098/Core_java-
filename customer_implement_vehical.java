interface vehical
{
	String name="TVS";//public+abstract
	int speed=100; //public+abstract
	
	
	void start();    //public+abstract
	void stop();    //public+abstract
	default void color()
	{
		System.out.println("TVS color is red");
	}
}
class customer implements vehical{
   // @override
	public void start()
	{
		System.out.println("start(): insert key & press button");
	}
//	@override
	public void stop()
	{
		System.out.println("stop(): exit key");
	}
	public static void main(String[] args) {
		 customer c=new  customer();
		c.start();c.stop();c.color();
       //vehical.speed();
       System.out.println(speed);
	}

}
