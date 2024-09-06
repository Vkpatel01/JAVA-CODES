class A
{
	void first()
	{
	int a=10,b=20;
	int res;
	res=a+b;
	System.out.println("Result: "+res);
	}
}
class B extends A
{
	void second()
	{
	int a=50,b=40;
	int res;
	res=a+b;
	System.out.println("Second Result: "+res);
	}
}
class inher
{
	public static void main(String args[])
	{
	B ob=new B();
	ob.first();
	ob.second();
	}
}