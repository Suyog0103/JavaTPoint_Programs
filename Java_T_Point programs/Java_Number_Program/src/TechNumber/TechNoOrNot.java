//Tech Number
//A number is called a tech number if the given number has an even number of digits 
//and the number can be divided exactly into two parts from the middle. After equally 
//dividing the number, sum up the numbers and find the square of the sum. If we get the
//number itself as square, the given number is a tech number, else, not a tech number. 
//For example, 2025, 3025, 9801 is a tech number.
//2025
//divide into two equal parts first= 20, last=25
//add first and last = 45
//take square of addition
//if square is == 2025 then TechNo else not

package TechNumber;

import java.util.Arrays;

public class TechNoOrNot {
	
//	public static boolean isEvenNo(int n)
//	{
//		int j =2;
//		for(int i=0; i<n; i++)
//		{
//			if(j==n)
//			{
//				return true;
//			}
//			else
//			{
//				j=j+2;
//			}
//		}
//		return false;
//	}
	
	public static boolean isEvenNo(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String args[])
	{
		int num=9801;
		int arr[]= new int[20];
		int n= num;
		int temp = 0;
		int i;
		while(n!=0)
		{
			temp = temp*10+(n%10);
			n=n/10;
		}
		System.out.println("temp = "+ temp );
		
		for(i=0; temp!=0;temp=temp/10, i++)
		{
			arr[i]=temp%10;
		}
		System.out.println("arr = "+Arrays.toString(arr));
		System.out.println("i = "+i);
		
		if(isEvenNo(i))
		{
			i=i-1;
			int first=0, last=0;
			for(int j=0; j<=i/2; j++)
			{
				first=first*10+arr[j];
			}
			for(int j=(i/2)+1; j<=i; j++)
			{
				last=last*10+arr[j];
			}
			System.out.println("first= "+first+" last= "+last);
			
			int sum = first + last;
			int square = sum * sum;
			if(square == num)
			{
				System.out.println(num +" is Tech Number");
			}else
			{
				System.out.println(num +" is not Tech Number");
			}
		}
		else
		{
			System.out.println("cant divide into two equal parts");
		}
		
		
	}
}
