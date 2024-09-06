/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int t;
	 Scanner sc=new Scanner(System.in);
	 t=sc.nextInt();
	 while(t!=0)
	 {
	     int r,s;
	     r=sc.nextInt();
	     s=sc.nextInt();
	     int count=0;
	     for(int i=0;i<r;i+=2)
	     {
	         for(int j=0;j<s;j+=2)
	         {
	         count=count+1;
	     }
	    }
	    System.out.println(count);
	    t=t-1;
	}
	//return 0;
}
}