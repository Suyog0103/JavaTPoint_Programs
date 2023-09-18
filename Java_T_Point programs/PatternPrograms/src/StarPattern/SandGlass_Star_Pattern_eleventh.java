//Pattern
//* * * * * * * *
// * * * * * * *
//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *
//* * * * * * * * 


package StarPattern;

public class SandGlass_Star_Pattern_eleventh {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			for(int k=0; k<i; k++)
			{
				System.out.print("_");
			}
			for(int j =i; j<6; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i=0; i<6; i++)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print("_");
			}
			for(int j =i; j>=0; j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
