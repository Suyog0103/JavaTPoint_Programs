package Factorial;
import java.util.Scanner;

public class FactorialUsingRecursion {
	
	public static int factorial(int no)
	{
		
		if(no==0)
		{
			return 1;
			
		}else {
			
			return(no*factorial(no-1));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert no:");
		int no = sc.nextInt();
		System.out.println("Factorial is "+factorial(no) );

	}

}
