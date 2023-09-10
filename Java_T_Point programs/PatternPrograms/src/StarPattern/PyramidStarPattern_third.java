//Pyramid star pattern
//     *     
//    * *    
//   * * *   
//  * * * *  
// * * * * *




package StarPattern;

public class PyramidStarPattern_third {
	public static void main(String[] args) {

		for(int i = 5; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int s=5; s>=i; s--)
			{
				System.out.print("* ");	
			}
			System.out.println();

		}
	}

}
