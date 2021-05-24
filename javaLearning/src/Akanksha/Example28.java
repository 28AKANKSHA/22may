package Akanksha;

public class Example28 
{
	int akku;
	public void method1(int akku)	
	{	
		akku=akku; 
	}
	public static void main(String[] args)
	{
		Example28 obj = new Example28();
		obj.method1(123);
		System.out.println("value of akku" +obj.akku);

	}
}
