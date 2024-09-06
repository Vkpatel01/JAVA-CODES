import java.util.*;

public class Fibonaci {
    public static void main(String args[]) {
        int previous = 0, current = 1, next = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:");
        int n = sc.nextInt();
        System.out.print(previous + " " + current);
        for (int i = 2; i <= n; ++i) {
            next = previous + current;
            System.out.print(" " + next);
            previous = current;
            current = next;

        }
    }
}
