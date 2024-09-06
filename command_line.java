//Command line arguments
class command_line
{
	public static void main(String args[])
	{
	int l,i=0;
	l=args.length;
	System.out.println("Numbers of arguments are: "+l);
	while(i<l)
	{
	String s=args[i];
	System.out.println(s + " Vishal");
	i++;
	}
	}
}