//Peterson Number
//Example of Peterson Number
//Suppose, we have to check the number (n) 145 is Peterson or not.
//
//Number = 145
//
//145 = !1 + !4 + !5 = 1+4*3*2*1+5*4*3*2*1
//
// = 1+24+120
//
//145=145
//
//We observe that the number and the sum of factorials of digits are equal to
//the number itself. Hence, 145 is a Peterson number.





package PetersonNumber;

public class PetersonNoOrNot {
	
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
		int num = 145;
		int arr[]= new int [10];
//		int arr1[];					//for practice purpose
//		int arr2 [] = {1,2};		//for practice purpose
		int temp = num;
		for(int i=0; temp!=0; temp = temp/10)
		{
			arr[i] = temp % 10;
			i++;
		}
		
		for(int j = 0; j<arr.length ;j++)
		{
			arr[j]= factorial(arr[j]);
		}
		
		int finalNo = 0;
		for(int k = 0; k<arr.length ;k++)
		{
			finalNo= finalNo+ arr[k];
		}
		System.out.println(finalNo+" finalNo");
		
		if(finalNo == num)
		{
			System.out.println(num+" is Peterson Number");
		}else
		{
			System.out.println(num+" is Not Peterson Number");
		}
		

	}

}
