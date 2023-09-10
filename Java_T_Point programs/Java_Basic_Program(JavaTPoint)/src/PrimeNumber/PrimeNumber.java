package PrimeNumber;

public class PrimeNumber {
	public static void main(String[] args) {
		int count=0;
		System.out.println("Prime no is ");
		for(int i=0; i<100; i++)
		{
			for(int j=i; j>0;j--)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.print(i+", ");
			}
			count=0;
		}
	}

}
