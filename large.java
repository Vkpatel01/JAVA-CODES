//largest of two numbers using multiple class, takes the input from the users.
//wap to arrange the elements of an array in descending order.
import java.util.*;
class largest 
{
	int d1,d2;
	void getdata(int a,int b)
	{
	d1=a;
	d2=b;
	}
	void calculate()
	{
	if(d1>d2)
	{
	System.out.println(d1+ " Is greatest in two numbers");
	}
	else if(d2>d1)
	{
	System.out.println(d2+" Is greatest in two numbers");
	}
	else
	System.out.println("Both are equal");
	}
	}
	class large
	{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First digit: ");
	int D1=sc.nextInt();
	System.out.println("Enter the Second digit: ");
	int D2=sc.nextInt();
	largest ob=new largest();
	ob.getdata(D1,D2);
	ob.calculate();
	}
	}