import java.util.*;
import java.io.*;

class loop2{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            for(int j = 1; j <= n; j++)
            {
                System.out.print((a + b) + " ");
                a = a + b;
                b = b * 2;
            }
            System.out.println();
        }
        sc.close(); 
    }
}