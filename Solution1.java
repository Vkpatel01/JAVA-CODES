import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer value: ");
        int i = scan.nextInt();
        System.out.println("Enter the Double value:");
        Double d = scan.nextDouble();
        System.out.println("Enter the String value:");
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
