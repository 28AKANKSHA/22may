package Akanksha;

import java.util.Scanner;

public class prime 
{
	public static void main(String[] args) 
	{
		System.out.println("enter any number");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int i,m=0, p=0;
		m=x/2;
		if(x==0 || x==1) {
			System.out.println("not prime number");
		} else {
			for(i=2; i<=m; i++) 
			{
				if(x%i==0)
			
			System.out.println("not prime number");
		break;
			}}
		
		if(p==0) {
			System.out.println("prime number");
		}
	}
}
