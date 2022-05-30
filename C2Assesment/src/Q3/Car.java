package Q3;
import java.util.*;
/*Q3)Create a Java bean class Car that has following fields:

numberOfPassenger :int
numberOfKms:int

Create a class Sedan that extends Car that has following fields:

final int farePerKm =20;

Create a class HatchBack that extends Car that has following fields:

final int farePerKm =15;

Create a class OLA that has following methods-
public Car bookCar(int numberOfPassenger, int numberOfKMs)

public int calculateBill(Car car)
 * */
public class Car 
{
	private int numberOfPassenger;
	private int numberOfKms;
	public int farePerKm;
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
}
class Sedan extends Car
{
	final int farePerKm =20;

	public int getFarePerKm() {
		return farePerKm;
	}
	
}
class HatchBack extends Car
{
	final int farePerKm =15;
}
class OLA
{
	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		if(numberOfPassenger<=3)
		{
			HatchBack h1 = new HatchBack();
			h1.setNumberOfKms(3);
			h1.setNumberOfPassenger(5);
			return h1;
		}
		else
		{
			Sedan s1 = new Sedan();
			s1.setNumberOfKms(7);
			s1.setNumberOfPassenger(9);
			return s1;
		}
	}
	/*Implement the bookCar method in such a way that if the numberOfPassenger is less
	than or equal to 3 then you should return the object of HatchBack else you should
	return the object of Sedan.
	Note : Set the fields of HatchBack and Sedan object appropriately.
	 * */
	
	/*Implement calculateBill method to calculate the total fare by using-
      Total fare=numberOfKms*farePerKm
	 * */
	public int calculateBill(Car car)
	{
		int Total_fare=car.getNumberOfKms()*car.farePerKm;
		return 0;
	}
}
/*Create a Main class with main method inside this main method take the input from the
user for the number of passengers and number of kms using the Scanner class and
call bookCar method using appropriate arguments and use this returned object in the
calculate bill method to calculate the total fare.
 * */
class Main
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//Write logic to get numberOfPassenger and numberOfKms

		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(12,10);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);
		}
}

