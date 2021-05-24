package Akanksha;

public class assign {
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
	public int multi(int e1,int j3) 
	{
		int k4;
		k4=e1*j3;
		System.out.println("multi result"+k4);
		return k4;
	}
	public void div(int a1,int b1) 
	{
		int b2;
		b2=a1/b1;
		System.out.println("Final result is"+b2);
		
	}
	
	public static void main(String[] args) 
	{
		assign s = new assign();
		int sumResult = s.sum(10, 2);
		int sumResult1 = s.sum(sumResult, 2);
		int subResult = s.sub(sumResult1, 2);
		int multiResult = s.multi(subResult, 2);
		s.div(multiResult, 2);

}
}
