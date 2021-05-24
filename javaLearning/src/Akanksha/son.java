package Akanksha;

public class son extends mom
{
	public son()
	{
		this(1,55,7,4);
		System.out.println("child default constructor");
	}
	public son(int a)
	{
		this(11,8,5);
		System.out.println("child one constructor");}
	public son(int a, int b)
	{
		this();
		System.out.println("child two constructor");}
	public son(int a, int b, int c)
	{
		this(2,6);
		System.out.println("child three constructor");}
	public son(int a, int b, int c, int d)
	{
		super(16,4,9,3);
		System.out.println("child four constructor");}
	
	public static void main(String[] args) 
{
		son obj = new son(22);
}
}
	
