//Sunny Number
//A number is called a sunny number if the number next to the given number is a perfect square.
//In other words, a number N will be a sunny number if N+1 is a perfect square.
//
//Let's understand it through an example.
//
//Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9.
//Hence 80 is a sunny number.
//
//Let's take another number 10.
//
//Given, N=10 then N+1 will be 10+1=11, which is not a perfect square.
//Hence 10 is not a sunny number.
//Some of other examples of sunny numbers include 3, 8, 15, 24, 35, 48, 63 etc.

package SunnyNumber;

public class SunnyNoOrNot {
	public static void main(String args[] )
	{
		int num = 80;
		int num1 = num +1;
		int flag = 0;
		for(int i=0; i!=num1; i++)
		{
			int j = i*i;
			if(j==num1)
			{
				flag =1;
			}
		}
		if(flag==1)
		{
			System.out.println(num+ " is Sunny number");
		}else
		{
			System.out.println(num+ " is not Sunny number");
		}
		
	}

}
