package Akanksha;

import java.util.Scanner;

public class swapThird 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("enter the value of x and y");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int y = s.nextInt();
		System.out.println("Value of x and y "+x+" " +y);
		a=x;
		x=y;
		y=a;
		System.out.println("After Swapping "+x+" " +y);


	}

}
