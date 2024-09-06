/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int t;
	    Scanner sc=new Scanner(System.in);
	
		t=sc.nextInt();
		while (t!=0)
		{
		    
		    int Z;
		    int Y;
		    int z=sc.nextInt();
		   int y=sc.nextInt();
		    int a=sc.nextInt();
		   int b=sc.nextInt();
		   int c=sc.nextInt();
		    Z=z-y;
		    Y=a+b+c;
		    if(Z==Y)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		    System.out.println("NO");
		    }
		    t=t-1;
		}
	}
}
