//Pattern
//
//* * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

package StarPattern;

public class ReversePyramidStarPattern_seventh {

	public static void main(String[] args) {

		for(int i=0; i<6; i++)
		{
//			System.out.print("i is "+i);
			for(int k=0; k<i;k++)                   //k<=i for this  condition space is print from first line           
			{
//				System.out.println(" k is "+k);     //for i=0 this loop is not iterated
				System.out.print("_");              //give only space here, this is done only for understanding purpose
			}
			for(int j =6; j>i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
