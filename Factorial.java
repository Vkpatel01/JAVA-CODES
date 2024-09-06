import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        FactorialCalc obj = new FactorialCalc();
        long value = obj.factorial();
        System.out.println(value);
    }
}

class FactorialCalc {
    public long factorial() {
        Scanner sc = new Scanner(System.in);
        long fact = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *=  i;
        }
        return fact;
    }
}
