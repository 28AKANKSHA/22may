package Akanksha;

import java.util.Scanner;

public class armstrong
{
	public static void main(String[] args) 
	{
		System.out.println("enter any number");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
	int a,c=0,b=x;
		while(x>0) 
	{
		a=x%10;
		x=x/10;
		c=c+(a*a*a);
	}
		if(b==c)
			System.out.println("Armstrong number");
		else
			System.out.println("not armstrong number");
		
	}
}
