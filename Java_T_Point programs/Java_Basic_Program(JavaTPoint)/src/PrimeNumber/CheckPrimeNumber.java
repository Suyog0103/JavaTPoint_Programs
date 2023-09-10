package PrimeNumber;
import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Number: ");
		int s=sc.nextInt();
		int count =0;
			for(int j=s; j>0;j--)
			{
				if(s%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.print(s+ " is Prime No");
			}else {
				System.out.print(s+ " is not a Prime No");
			}
			
		
	}

}
