//DiamondShapePattern
//      *
//     ***
//    *****
//   *******
//    *****
//     ***
//      *




//output of first code
//_____* 
//____* * 
//___* * * 
//__* * * * 
//_* * * * * 
//__* * * * 
//___* * * 
//____* * 
//_____* 
//______

//package StarPattern;
//
//public class DiamondShapePattern_fourth {
//
//	public static void main(String[] args) {
//			for(int i = 5; i>0; i--)
//			{
//				for(int s = i; s>0; s--)
//				{
//					System.out.print("_");
//				}
//				for(int x= 5; x>=i; x--)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//			
//			for(int j=1; j<6; j++)
//			{
//				for(int y = 0; y<=j; y++)
//				{
//					System.out.print("_");
//				}
//				for(int r=5; r>j; r--)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//
//	}
//
//}




package StarPattern;

public class DiamondShapePattern_fourth {

	public static void main(String[] args) {
			for(int i = 5; i>0; i--)
			{
				for(int first = i; first>0; first--)
				{
					System.out.print(" ");
				}
				for(int second= 5; second>=i; second--)
				{
					System.out.print("*");
				}
				for(int third=4; third>=i; third--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int j=1; j<6; j++)
			{
				for(int first = 0; first<=j; first++)
				{
					System.out.print(" ");
				}
				for(int second=5; second>j;second--)
				{
					System.out.print("*");
				}
				for(int third=3; third>=j; third--)
				{
					System.out.print("*");
				}
				System.out.println();
			}

	}

}
