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
	int a=10,b=30;
	int res;
	res=a+b;
	System.out.println("Second Result: "+res);
	}
}
class C extends B
{
	void third()
	{
	int a=10,b=40;
	int res;
	res=a+b;
	System.out.println("\n \nThird Result: "+res);
	}
}
class mulinher
{
	public static void main(String args[])
	{
	B ob=new B();
	C obj=new C();
	ob.first();
	ob.second();
	obj.third();
	obj.second();
	}
}