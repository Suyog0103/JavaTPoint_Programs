package Fibonacci_Series;

public class Fibonacci_with_recursion {
	static int n1=0,n2=1, n3;
	public static void fib_recursion(int count)
	{
		if(count>0)
		{
		n3=n1+n2;
		System.out.print(n3+", ");
		n1=n2;
		n2=n3;
		fib_recursion(count-1);
		}
	}
	
	public static void main(String [] args)
	{	
		int count=10;
		System.out.println("fibonacci with recursion");
		System.out.print(n1+", "+n2);
		fib_recursion(count-2);
	}
}
