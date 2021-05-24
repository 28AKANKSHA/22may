package Akanksha;

public class mom 
{
	public mom()
	{
		this(11,44,88);
		System.out.println("parent default constructor");
	}
	public mom(int a)
	{
		this();
		System.out.println("parent one constructor");}
	public mom(int a, int b)
	{
		this(44);
		System.out.println("parent two constructor");}
	public mom(int a, int b, int c)
	{
	
		System.out.println("parent three constructor");}
	public mom(int a, int b, int c, int d)
	{
		this(1,2);
		System.out.println("parent four constructor");}
}

