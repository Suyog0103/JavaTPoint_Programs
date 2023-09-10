package PetersonNumber;

public class PetersonNoSimplerWay {
	public static int factorial(int num)
	{
		for(int i = num-1; i!=0; i--)
		{
			num = num*i;
		}
		System.out.println("factorial of num is "+num);
		return num;
	}

	public static void main(String[] args) {
		int num =145;
		int sum = 0;
		int temp = num;
		while(temp!=0)
		{
			sum = sum + factorial(temp%10);
			temp = temp/10;
		}
		System.out.println("sum =" +sum);
		if(sum == num)
		{
			System.out.println(num+" is Peterson Number");
		}else
		{
			System.out.println(num+" is Not Peterson Number");
		}
		

	}

}
