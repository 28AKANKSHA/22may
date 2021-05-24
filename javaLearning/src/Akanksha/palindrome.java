package Akanksha;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		int b,c=0,a;
	
		System.out.println("enter any number");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		a=x;
		while(x>0) 
		{
			b=x%10;
			c=(c*10)+b;
			a=a/10;
		}
	if (a==c) {
		System.out.println("Pailndrome number");
	}
		else {
		System.out.println("Not Pailndrome number");
		}

	}
	
}
