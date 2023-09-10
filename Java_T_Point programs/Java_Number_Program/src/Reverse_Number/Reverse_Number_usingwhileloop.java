package Reverse_Number;

public class Reverse_Number_usingwhileloop {

	public static void main(String[] args) {
		int num = 123456789;
		System.out.println("number = "+num);
		int reverse=0;
		while(num!=0)
		{
			int remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10;	
		}
		System.out.println("Reverse number = "+reverse);
	}

}
