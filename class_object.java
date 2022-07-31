class class_object {

	int age=20;
	int weight=56;
	String color="light";
	void eat()
	{
		System.out.println("i'm eating");
	}
	void sleep()
	{
		System.out.print("i'm sleeping");
	}
	public static void main(String[] args) {
		class_object p=new class_object();
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.color);
		p.eat();p.sleep();
	}

}
