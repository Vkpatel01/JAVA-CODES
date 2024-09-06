//Reverse an integer
import java.util.*;
class Rev{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);

	int a=sc.nextInt();
	int Original=a;
	int rev=0;
	while(a>0){
		int z=a%10;
		a=a/10;
		rev=rev*10+z;

	}
	System.out.println(rev);
}
}