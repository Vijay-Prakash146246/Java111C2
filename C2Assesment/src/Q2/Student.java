package Q2;
import java.util.*;
/*Q2)Create a Student Bean class with the following fields:
roll: Integer
name: String
address: String
marks: Integer
 * */
public class Student {
private int roll;
private String name;
private String address;
private int marks;

public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
void Student()
{
}

}

/*
 * Create a Demo class and perform the following operation in the main method:
Take the number as input from the user, How many Student objects need to be
created.
Create an array of Students with those numbers.
Initialize all the student objects by taking details from the user.
print all the Student details.
print the average of all the Student marks.*/

class Demo 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Student");
		int num = s.nextInt();
		Student [] arr= new Student[num];
		/*
		 * private int roll;
           private String name;
           private String address;
           private int marks;
		 * */
				
		for(int i=1;i<=num;i++)
		{
			Student s1 = new Student();
			System.out.println("Enter Student "+i+" Details ");
			System.out.println("Enter Student Address ");
			String Add1 = s.nextLine();
			s1.setAddress(Add1);
			System.out.println("Enter Student RollNo ");
			int roll=s.nextInt();
			s1.setRoll(roll);
			System.out.println("Enter Student marks ");
			int mark=s.nextInt();
			s1.setMarks(mark);
			System.out.println("Enter Student name ");
			String  name=s.next();
			s1.setName(name);
	}
}
}