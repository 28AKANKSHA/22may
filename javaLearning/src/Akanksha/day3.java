package Akanksha;

public class day3
{
	public day3()
{
	this(1,2,3);
	System.out.println("default constructor");
}
	public day3(int a) 
	{
	
		System.out.println("one parameterized constructor");	
	}
	public day3(int a, int b) 
	{
		this(22);
		System.out.println("two parameterized constructor");
		}
	public day3(int a, int b, int c) 
	{
		
		System.out.println("three parameterized constructor");
		}
	public day3(int a, int b, int c, int d) 
	{
		
		System.out.println("four parameterized constructor");
		}
	public static void main(String[] args) 
	{
		day3 obj = new day3();
		day3 obj2 = new day3(44,77);
		day3 obj3 = new day3(44,77,4,7);
		
		
	}
}