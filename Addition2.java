import java.util.Scanner;
class Addition1
{
    double digit1,digit2;
    void Add(double D1,double D2)
    {
        digit1=D1;
        digit2=D2;
    }
    void calculate()
    {
        double result=digit1+digit2;
        System.out.println("The addition of the two digits are: " +result);
    }
}
class Addition2
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the First digit: ");
     double d1=sc.nextDouble();
     System.out.println("Enter the Second digit: ");
     double d2=sc.nextDouble(); 
     Addition1 obj=new Addition1();
     obj.Add(d1,d2);
     obj.calculate();
    }
}