//Program to count the length of an integer.

import java.util.*;
class Length{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digits: ");
		int a=sc.nextInt();
		int count=0;
		while(a>0){
			a=a/10;
			count++;
		}
		System.out.println("Toal number of digits are:"+count);
	}
}