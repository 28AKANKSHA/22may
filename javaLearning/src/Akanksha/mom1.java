package Akanksha;

public class mom1 
{
	public void mom2()
	{
		this.mom5(7,9, 4);
		System.out.println("parent default method");
	}
	public void mom3(int a)
	{
		this.mom2();
		System.out.println("parent one method");}
	public void mom4(int a, int b)
	{
	
		this.mom3(4);
		System.out.println("parent two method");}
	public void  mom5(int a, int b, int c)
	{
	
		System.out.println("parent three method");}
	public void mom6(int a, int b, int c, int d)
	{

		this.mom4(7, 8);
		System.out.println("parent four method");}
}


