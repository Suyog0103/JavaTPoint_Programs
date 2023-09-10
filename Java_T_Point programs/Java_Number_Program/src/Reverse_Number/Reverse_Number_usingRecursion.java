package Reverse_Number;

public class Reverse_Number_usingRecursion {
	
	public static void reverseNumber(int num)
	{
		if(num<10)
		{
			System.out.print(num);
			return;
		}
		else {
			System.out.print(num%10);
			reverseNumber(num/10);
		}
		
	}

	public static void main(String[] args) {
		int num = 123456789;
		System.out.println("original number is "+num);
		System.out.print("Reverse Number is ");
		reverseNumber(num);

	}

}
