/* Implemntation of Inheritance to print the Full name */
import java.util.*;
class first_name
{
	void first()
	{
		String a="Vishal";
	System.out.print(a+" ");
	}
}
class middle_name extends first_name
{
	void middle()
	{
		String b="Kumar";
		System.out.print(b+" ");
	}
}
class last_name extends middle_name
{
	void second()
	{
		String c="Patel";
	 System.out.print(c+" ");
	}
}
class full_name
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the First Name: ");
		String a=sc.nextLine();
		System.out.println("Enter the Middle Name: ");
		String b=sc.nextLine();
		System.out.println("Enter the Last Name: ");
		String c=sc.nextLine();*/
	 last_name ob=new last_name();
	 ob.first();
	 ob.middle();
	 ob.second();
	}
}