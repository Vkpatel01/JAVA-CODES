//Method 
import java.util.*;
class add1
{
	double a,b;
	
		 void getdata(double x, double y)
		{
			a=x;
			b=y;
		}
		void getdata(double z)
		{
			a=b=z;
		}
		void calculate()
		{
		double res=a+b;
		System.out.println("Results: "+res);
	    }
}
class Madd1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Digit: ");
	double D1=sc.nextDouble();
	System.out.println("Enter the Second Digit: ");
	double D2=sc.nextDouble();
	add1 ob=new add1();
	ob.getdata(D1,D2);
	ob.calculate();
	ob.getdata(D1);
	ob.calculate();
    }
}