package PalindromeNo;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("insert no");
	int no = sc.nextInt();
	int reverse=0;
	int temp = no;
	while(temp!=0)
	{
		reverse = reverse*10 + (temp%10);
		temp = temp/10;
	}
	if(no==reverse)
	{
		System.out.println(no+ " is palindrome no");
	}else
	{
		System.out.println(no+ "is not palindrome no");
	}
	}
}
