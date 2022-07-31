abstract class animal
{
	void lags()  //behaviours
	{
		System.out.println("all animals have 4 lags");
	}
	abstract void sound(); //kono class modheye abstract keyword used holo oi class abstract class hoye jay
	abstract void eat();
	
}
class Dog extends animal
{
	//@override
	void sound() //action-->common sound and eat 
	{
		System.out.println("bow bow...!"); //implementiens-->behaviours change
	}
	void eat()  //action
	{
		System.out.println("meat eating...!");
	}
}
class cow extends animal
{
	//@override
	void sound() //action
	{
		System.out.println("0ooo 0ooo...!");
	}
	void eat()   //action
	{
		System.out.println("grass eating...!");
	}
}
public class Abstraction_class {

	public static void main(String[] args) {
		Dog d=new Dog();
		cow c=new cow();
		d.sound();d.eat();d.lags();
		c.sound();c.eat();c.lags();
	}

}
