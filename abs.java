/* Abstract Class*/
// we can not create objects of abstract class.It may contains abstract method or non abstract method.
//we can not declare method outside abstract class
abstract class A
{
    abstract void display();// it is method which does not have any body
	}
    class B extends A
{
	void display()
	{
	System.out.println("Class B");
	}

}
class abstract_example
{
	public static void main(String args[])
	{
     A obj=new B();// Here obj is the object of Class B.
     obj.display();
	}
}