package ArmstrongNo;
import java.util.Scanner;

public class AnotherMethod {
	
	public static void armstrongNo(int no)
	{
	int temp=no;
	int count=0, sum=0, lastDigit;
	while(temp!=0)
	{
		temp = temp/10;
		count++;
	}
	
	temp=no;
	while(temp!=0)
	{
		lastDigit = temp%10;
		sum= sum + (int) (Math.pow(lastDigit,count));  //Math.pow() returns double
		temp=temp/10;
	}
	
	if(no==sum)
	{
		System.out.print(no+" ");
	}
	return;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert limit:");
		int no = sc.nextInt();
		System.out.println("Armstrong no is ");
		for(int i=1; i<=no; i++)
		{
			armstrongNo(i);
		}
	
}
}
