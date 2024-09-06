import java.util.*;
import java.io.*;
class calcul
{
	public static void main(String args[])throws IOException
	{
	
	float a=0,s=0,m=1,d=0,md=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the First digit: ");
	float input1= sc.nextFloat();
	System.out.println("Enter the second digit: ");
	float input2= sc.nextFloat();
	//InputStreamReader r=new InputStreamReader(System.in);    
    //BufferedReader br=new BufferedReader(r);    
	System.out.println("\n\n Enter the Operation Add(+), Sub(-), multiply(*), div(/), mod_div(%)  ");
	//String i=br.readLine();   
	String i=sc.next();
		if( i.equals("Add"))
	{
		
		a=input1+input2;
		System.out.println("\n Addition of the Inputs are: "+a);
	}
	else if( i.equals("Sub"))
	{
		s=input1-input2;
		System.out.println("\n Substraction of the Inputs are: "+s);
	}
	else if(i.equals("Mul"))
	{
	  m=input1*input2;
	  System.out.println("\n Multiplication of the Inputs are: "+m);
	}
	else if(i.equals("Div"))
	{
		d=input1/input2;
		System.out.println("\n Division of the Inputs are: "+d);
	}
	else if( i.equals("Mod_Div"))
	{
		md=input1%input2;
		System.out.println("\n Modular Division of the Inputs are: "+md);
	}
    else
    	System.out.println("\n \n  Invalid Operation"); 
	}
}