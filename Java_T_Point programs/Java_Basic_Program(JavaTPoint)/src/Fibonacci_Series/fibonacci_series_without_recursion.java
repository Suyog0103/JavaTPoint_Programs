package Fibonacci_Series;
//In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
//The first two numbers of fibonacci series are 0 and 1.
//
//There are two ways to write the fibonacci series program in java:
//
//Fibonacci Series without using recursion
//Fibonacci Series using recursion



public class fibonacci_series_without_recursion {

	public static void main(String[] args) {

		int n1 =0, n2=1, n3;
		System.out.println("fibonacci series:");
		System.out.print(n1+", "+ n2+", ");
		
		for(int i=0;i<10;i++)
		{
			n3= n1+n2;
			System.out.print(n3+", ");
			n1=n2;
			n2=n3;
		}
	}

}
