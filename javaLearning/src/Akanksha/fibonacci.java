package Akanksha;

import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args) 
	{
	
		System.out.println("enter any number");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		System.out.println("Fibonacci series");
		int i,a=0,b=0,c=1;
		for(i=1;i<=x;++i) 
		{
			a=b;
			b=c;
		c=a+b;
		System.out.println(a+ "");

		}
		
	}
}
