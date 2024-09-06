import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n = sc.nextInt();
        System.out.println("Enter the second number:");
        long m = sc.nextLong();

        for (int i = n; i <= m; i++) {
            int numCube = 0; // Reset numCube for each number i
            int temp = i; // Store the original value of i
            while (temp > 0) {
                int digit = temp % 10;
                numCube += (int) Math.pow(digit, 3);
                temp /= 10;
            }
            if (numCube == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}
