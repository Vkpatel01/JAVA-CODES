import java.util.*;

public class method {
    public static void main(String[] args) {
        Addition obj = new Addition();
        int res = obj.add(9, 8);
        System.out.println(res);
        int res2 = obj.add(8, 15, 18);
        System.out.println(res2);
        String str = obj.add();
        System.out.println(str);
    }

}

class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add() {
        return "Done by Vishal";
    }
}
