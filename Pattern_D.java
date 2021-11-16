//OUTPUT
* * * * * * * * * 
  *             * 
  *             * 
  *             * 
  *             * 
  *             * 
  *             * 
  *             * 
* * * * * * * * * 
//

public class Pattern_D {

	public static void main(String[] args) 
	{
		for(int row = 1; row<=9; row++)
		{
			if(row==1 || row == 9)
			{
				for(int col = 1; col<=9; col++)
				{
					System.out.print("* ");
				}
			}
			else 
			{
				for(int col = 1; col<=9; col++)
				{
					if(col==2 || col==9)
					{
					System.out.print("* ");
					}
					else
					{
					System.out.print("  ");	
					}
				}					
				}			
		System.out.println();
		}		
	}
}