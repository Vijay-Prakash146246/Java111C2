//Q1) Explain the difference between IS-A and Has-A relationship with the help of an
//example and explain about access modifiers and their accessibility?

/* The basic difference between Is-A and Has-A relationship is 
 * When a class inherit another class then this is known as is a relationship and when 
 * When a class implement interface is known as has a relationship
 * */
package Q1;
class Animal
{
	int Age;
}
class Dog extends Animal
{
	
	String Name;
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.Name ="Rocky";
		d.Age=6;
		System.out.println(d.Age);
		
		
		Person p = new Person();
		p.eat();
	}

}

interface food
{
	void eat();
}
class Person implements food
{
	public void eat()
	{
		System.out.println("We are eating Food");
	}
}
