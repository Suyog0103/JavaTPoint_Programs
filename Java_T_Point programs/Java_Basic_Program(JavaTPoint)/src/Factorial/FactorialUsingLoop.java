package Factorial;
import java.util.Scanner;

public class FactorialUsingLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert no:");
		int no = sc.nextInt();
		if(no==0)
		{
			no=1;
		}
		for(int i=no-1;i>0;--i)
		{
			no = no * i;
		}
		System.out.println("Factorial is " +no);
		
	}
}
