import java.util.*;
import java.io.*;
class calculator
{
	public static void main(String args[])
	{
	//int input1,input2;
	float add=0,sub=0,multiply=1,div=0,mod_div=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the First digit: ");
	float input1= sc.nextFloat();
	System.out.println("Enter the second digit: ");
	float input2= sc.nextFloat();
	
    add=input1+input2;
    sub=input1-input2;
    multiply=input1*input2;
    div=input1/input2;
    mod_div=input1%input2;
    System.out.println("Addition of the Inputs are: "+add);
    System.out.println("Substraction of the Inputs are: "+sub);
    System.out.println("Multiplication of the Inputs are: "+multiply);
    System.out.println("Division of the Inputs are: "+div);
    System.out.println("Modular Division of the Inputs are: "+mod_div);
	}
}