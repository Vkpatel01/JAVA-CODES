import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        int first=sc.nextInt();
        System.out.println("Enter the second number");
        int second=sc.nextInt();
        int res=intswap(first,second);
        System.out.println("The sum are:"+res);

    }

     static int intswap(int a, int b) {
        int sum=a+b;
        return sum ;


    }
}
