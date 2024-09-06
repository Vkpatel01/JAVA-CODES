//Area of a rectangle
import java.util.*;
class length //class declaration
{
	float length,breadth;// variables declaratiions
	void getdata(float l,float b)// method with parameters
	{
		length =l;
		breadth=b;
	}
		void calculate()// method  declaration
		{
			float result=length*breadth;
			System.out.println("Area :"+result);
		}
}
	class Area//main class declaration
	{
		public static void main(String[] args)
		{
			length ob=new length();
			System.out.println("Enter the values(Length and breadth): ");
			Scanner sc=new Scanner(System.in);//for scanning the input data
			float m=sc.nextFloat();
			float n=sc.nextFloat();
			ob.getdata(m,n);// call data from other class
			ob.calculate();
		}
	}
