class A
{
	int a=10;
	void change()
	{
	a=20;
	System.out.println(a);
	}
}
class myclass
{
	public static void main(String args[])
	{
     A obj=new A();
     obj.change();
	}
}