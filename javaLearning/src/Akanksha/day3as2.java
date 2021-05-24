package Akanksha;

public class day3as2 
{
	public void akku1() 
	{
		this.akku5(5);
		
		System.out.println("Default method");
	}
	public void akku2(int a)
	{
		System.out.println("one parameterized method");
	}
	public void akku3(int b)
	{
		
		System.out.println("two parameterized method");
	}
	public void akku4(int c)
	{
		this.akku2(8);
		this.akku3(55);
		System.out.println("three parameterized method");
	}
	public void akku5(int d)
	{
		System.out.println("four parameterized method");
		
	}
	public static void main(String[] args) 
	{
		day3as2 obj = new day3as2();
		obj.akku1();
		obj.akku4(89);
	
}
	}
