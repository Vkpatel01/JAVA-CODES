//Method overloading
import java.util.*;
class circle
{
	double radius;
	double pie=3.14;
	void getdata(double x)
	{
	radius=x;
	}
	void calculation()
	{
	 //double pie=3.14;
	 double res=pie*radius*radius;
	 System.out.println("Area of the Circle is: "+res);
	 double circum=2*pie*radius;
	 System.out.println("Circumference of the Circle is: "+circum);
	}
	
}
class AreaCircle
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Radius: ");
	double rad=sc.nextDouble();
	circle ob=new circle();
	ob.getdata(rad);
	ob.calculation();
	}
}
