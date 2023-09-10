//pattern
//5432*
//543*1
//54*21
//5*321
//*4321



public class SecondPattern {

	public static void main(String[] args) {
		int s=1, ss=2;
		for(int i=5; i>=1;i--)
		{
			if(i==1)
			{
				s=0;
			}
			for(int j=5; j>=1;j--)
			{
				if(s==1)
				{
					System.out.print(j);
					if(j==ss)
					{
						s=0;
						++ss;
					}
					
				}else {
					System.out.print("*"); 
						s=1;	
				}
				
			}
			System.out.println();
		}

	}

}
