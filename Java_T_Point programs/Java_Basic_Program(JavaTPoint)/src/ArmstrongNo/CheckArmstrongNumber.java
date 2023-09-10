package ArmstrongNo;
import java.util.Scanner;

//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
//It is also known as pluperfect, or Plus Perfect, or Narcissistic number. It is an OEIS sequence A005188.
//1^1 = 1
//2^1 = 2
//
//3: 3^1 = 3
//
//153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
//
//125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
//
//1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert no:");
		int no = sc.nextInt();
		int arr[]=new int[10];
		int temp=no;
		int count=0;
		while(temp!=0)
		{
			arr[count]=temp%10;
			temp=temp/10;
			count++;
		}
		int temp1=0;
		for(int i =count-1;i>=0;i--)
		{
			temp1= temp1 + (int) (Math.pow(arr[i],count));  //Math.pow() returns double
		}
		
		if(no==temp1 && no!=0)
		{
			System.out.println(no + " is Armstrong no");
		}else {
			System.out.println(no + " is not Armstrong no");
		}
	}

}
