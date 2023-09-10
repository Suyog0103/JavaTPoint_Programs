package Reverse_Number;

public class Reverse_Number_usingforloop {

	public static void main(String[] args) {
		int num = 123456789;
		System.out.println("number = "+num);
		int reverse=0;
		for(; num>0; num= num/10)
		{
			int remainder = num%10;
			reverse = reverse*10 + remainder;	
		}
		System.out.println("Reverse number = "+reverse);
	}

}
