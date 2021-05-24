package Akanksha;

import java.util.Scanner;

public class swapWithout 
{
	
	public static void main(String[] args) 
	{
		System.out.println("enter the value of x and y");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int y = s.nextInt();
		System.out.println("Value of x and y "+x+" " +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping "+x+" " +y);

	}

}
