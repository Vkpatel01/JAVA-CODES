public class swapexmpl {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
    }
    static void swap(int x, int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
    }
}
