package StarPattern;

public class Left_Pascals_Triangle_tenth {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			for(int j=i; j<6; j++)
			{
				System.out.print("_");
			}
			for(int k=0;k<=i ;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i+1; j++)
			{
				System.out.print("_");
			}
			for(int k=5;k>i ;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
