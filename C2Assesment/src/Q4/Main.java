/*Q4)Make a class Person which Has-A relationship with the Address class and has

following instance variable-
name :String

gender :String

Address class has following instance variable-
city : String

state : String
pinCode : String

Create another class Instructor which is a child of Person and has

following instance variable-
instructorId : int

salary : int
 * */

package Q4;
class Person
{
	String name;
	String gender;
}
class Address extends Person
{
	String city;
	String state;
	String pinCode;
}
class Instructor extends Person
{
	int instructorId;
	int salary;
}
/*
 * Create another class Student which is a child of Person and has

following instance variable-
studentId : int

courseEnrolled : String
courseFee : int
 * */
class Student extends Person
{
	int studentId;
	String courseEnrolled ;
	int courseFee;
}

/*Create a Main class with a following static method-
public static Person generatePerson(Person person);

Inside the main method of this Main class call the generatePerson() method with one
object of the student and one object of the instructor class.

And print the same with the help of overriding toString method.

Note : Override toString method in all the classes.
 * */
public class Main {
	public static Person generatePerson(Person person)
	{
		Person p = new Person();
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
	}

}
