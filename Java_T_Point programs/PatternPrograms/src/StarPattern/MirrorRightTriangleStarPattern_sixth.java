//Pattern
//
//      *
//     **
//    ***
//   ****
//  *****
// ******

package StarPattern;

public class MirrorRightTriangleStarPattern_sixth {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<5; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=0;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

		
	}

}
