package Akanksha;

public class Student 
{
	public int sum(int a,int b) 
	{
		int c;
		c=a+b;
		System.out.println("Sum Result is"+c);
		return c;
	}
	public int sub(int p,int m) 
	{
		int l;
		l=p-m;
		System.out.println("sub result is"+l);
		return l;
	}
	public void multi(int e1,int j3) 
	{
		int k4;
		k4=e1*j3;
		System.out.println("final result"+k4);
	}
	
	public static void main(String[] args) 
	{
		Student s = new Student();
		int sumResult = s.sum(12, 2);
		int subResult = s.sub(12, 2);
		s.multi(sumResult, subResult);
		
	}
}
