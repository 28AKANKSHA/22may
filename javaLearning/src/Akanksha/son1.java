package Akanksha;

public class son1 extends mom1
{
	public void son6()
	{
		this.son5(8, 7, 4, 2);
		System.out.println("child default method");
	}
	public void son2(int a)
	{
		this.son4(1, 4, 7);
		System.out.println("child one method");}
	public void son3(int a, int b)
	{
		this.son6();
		System.out.println("child two method");}
	public void son4(int a, int b, int c)
	{
		this.son3(39, 8);
		System.out.println("child three method");}
	public void son5(int a, int b, int c, int d)
	{
		super.mom6(44, 6, 7, 8);
		System.out.println("child four method");}
	
	public static void main(String[] args) 
{
		son1 obj = new son1();
		obj.son2(33);
}

}
