//Program will return the sum of single digit even number
import java.util.*;
class A1{
	public static void  main(String[] args){
		int c=0;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a>0){
			int b=a%10;
			a=a/10;
			if(b%2==0){
				c=c+b;	
			}		
		}
		System.out.println(c);
	}
}
