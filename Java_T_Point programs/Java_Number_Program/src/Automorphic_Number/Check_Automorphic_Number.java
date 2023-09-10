//Automorphic Number
//A number is called an automorphic number if and only if the square 
//of the given number ends with the same number itself. For example, 
//25, 76 are automorphic numbers because their square is 625 and 5776, 
//respectively and the last two digits of the square represent the number itself.
//Some other automorphic numbers are 0, 1, 5, 6, 25, 76, 376, 625, 9376, etc.

package Automorphic_Number;

import java.util.Scanner;

public class Check_Automorphic_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number to check number is Automorphic or not");
		int num = sc.nextInt();  //25
		
		int temp = num*num; //625
		System.out.println("temp= "+temp);
		int temp1 = num; //25
		int temp2 = 0;
		while(temp1!=0)
		{
			temp2= temp2 *10 + temp%10;  //52
			temp= temp/10;
			temp1=temp1/10;
			System.out.println("temp2= "+temp2);
		}
		temp1=num;
		int reverse = 0;
		while(temp1!=0)
		{
			reverse = reverse*10 + temp2%10; //25
			temp2 = temp2/10;
			temp1=temp1/10;
			System.out.println("reverse= "+reverse);
		}
		
		if(reverse == num)
		{
			System.out.println(num+ " is an Automorphic number");
		}else {
			System.out.println(num+ " is not an Automorphic number");
		}
		
		
	}

}
