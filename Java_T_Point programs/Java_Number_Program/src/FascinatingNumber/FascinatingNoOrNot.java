//Fascinating Number
//Multiplying a number by two and three separately, the number obtained by writing the results
//obtained with the given number will be called a fascinating number. If the result obtained after
//concatenation contains all digits from 1 to 9, exactly once.
//
//In other words, we can also say that a number (n) may be a fascinating number if it satisfies the
//following two conditions:
//
//1) If the given number is a 3 or more than three-digit                                             //imp
//2) If the value getting after concatenation contains all digits from 1 to 9, exactly once.
//
//Example
//Let's take any number (n) say 327 and check whether the given number is fascinating or not. 
//On multiplying the given number (n) by 2 and 3, we get:
//
//327×2=654                                                                                         //imp
//
//327×3=981                                                                                         //imp
//
//Now, concatenate the above results to the given number (n).
//
//"327"+"654"+ "981"= 327654981                                                                      //imp
//
//We observe that the resultant () contains all the digits from 1 to 9, exactly once. Hence, the 
//given number 327 is a fascinating number. Note that, we have not added the result to the given number. 
//Some other fascinating numbers are 192, 219, 273, 327, 1902, 1920, 2019 etc.

package FascinatingNumber;

public class FascinatingNoOrNot {

	public static void main(String[] args) {
		int num = 1920;
		int digit =0;
		int temp = num;
		while(temp!=0)
		{
			digit++;
			temp=temp/10;
		}
		if(digit>=3)
		{
			int firstNum = num*2;
			int secondNum = num*3;
			String original = Integer.toString(num);     //converted number to string to concat all numbers
			String first = Integer.toString(firstNum);
			String second = Integer.toString(secondNum);
			String concat = original+first+second;        //concated numbers here
			System.out.println("Concat is "+concat);
			long concatNo= Long.parseLong(concat);    //int hold upto 10 digit to hold more than 10 digit we have used long
			int total=0;
			for(int i =1; i<10; i++)
			{
				long temp1=concatNo;
				while(temp1!=0)
				{
					if(i==temp1%10)
					{
						total=total+i;
					}
					temp1=temp1/10;
				}
			}
			System.out.println("total is "+total);
			if(total==45)                                //because sum of 1 to 9 nos is 45
			{
				System.out.println(num+" is Fascinating Number");
			}
			else
			{
				System.out.println(num+" is not Fascinating Number");
			}
			
			
		}
		else
		{
			System.out.println("Number is less than 3 Digits");
		}

	}

}
