//right triangle star pattern
//      *
//     **
//    ***
//   ****
//  *****

package StarPattern;

public class LeftTriangleStarPattern_second {

	public static void main(String[] args) {
		
		int l=4;
		for(int i=0; i<5; i++)
		{
			for(int j=l; j>0; j--)
			{
					System.out.print(" ");
			}
			for(int s= 0; s<=i;s++)
			{
					System.out.print("*");
			}
			System.out.println();
			l--;
			
		}

	}

}
