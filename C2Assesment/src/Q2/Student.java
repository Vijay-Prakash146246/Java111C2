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
				
		for(int i=0;i<num;i++)
		{
			arr[i] = new Student(); //this is mandatory 
			System.out.println("Enter Student "+i+" Details ");
			System.out.println("Enter Student Address ");
			String Add1 = s.nextLine();
			s.nextLine();;
			arr[i].setAddress(Add1);//assign the element for each and every element 
			System.out.println("Enter Student RollNo ");
			int roll=s.nextInt();
			arr[i].setRoll(roll);
			System.out.println("Enter Student marks ");
			int mark=s.nextInt();
			arr[i].setMarks(mark);
			System.out.println("Enter Student name ");
			String  name=s.next();
			arr[i].setName(name);
		}
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Details of "+(i+1)+" Student " );
			System.out.println("Address Of Student "+arr[i].getAddress());
			System.out.println("Marks Of Student "+arr[i].getMarks());
			System.out.println("Name Of Student "+arr[i].getName());
			System.out.println("Roll-No Of Student "+arr[i].getRoll());
			sum+=arr[i].getMarks();
		}
		double avg=sum/arr.length;
		System.out.println("Average Mark's is "+avg);
}
}