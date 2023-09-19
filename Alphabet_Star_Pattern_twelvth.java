//pattern
//
//****
//*   *
//*   *
//*   *
//*****
//*   *
//*   *
//*   *
//*   *

package StarPattern;

public class Alphabet_Star_Pattern_twelvth {

	public static void main(String[] args) {
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<i+4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int k=0; k<i+3;k++)
			{
				System.out.println("*   *");
			}
		}

	}

}
