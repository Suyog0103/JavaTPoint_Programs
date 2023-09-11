//Pattern
//
//******
// *****
//  ****
//   ***
//    **
//     *

package StarPattern;

public class RightDownMirrorStarPattern_eighth {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("_");
			}
			for(int k=6; k>i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
