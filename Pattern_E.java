//OUTPUT
* * * * * * * * * 
*                 
*                 
*                 
* * * * * 
*                 
*                 
*                 
* * * * * * * * * 
//

public class Pattern_E {

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
			else if(row==5)
			{
				for(int col = 1; col<=5; col++)
				{
					System.out.print("* ");
				}
			}
			else 
			{
				for(int col = 1; col<=9; col++)
				{
					if(col==1)
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