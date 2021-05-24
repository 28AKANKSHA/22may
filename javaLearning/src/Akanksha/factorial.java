package Akanksha;

import java.util.Scanner;

public class factorial 
{
	public static void main(String[] args) 
	{
		int c=1,a;
	
		System.out.println("enter any number");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
	for(int i=1; i<=x; i++ )
		
		c= c*i;
	
	System.out.println("Factorial of" +x+ " is: "  +c  );

	
	}

}
