//OUTPUT
* * * * * * * * * 
*                 
*                 
*                 
* * * * * * * * * 
                * 
                * 
                * 
* * * * * * * * * 
//

public class Pattern_S {

	public static void main(String[] args) 
	{
		for(int row = 1; row<=9; row++)
		{
			if(row==1 || row==5 || row==9)
			{
				for(int col = 1; col<=9; col++)
				{
					System.out.print("* ");
				}
			}
			else if(row==2 || row==3 || row==4)
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
			else if(row==6 || row==7 || row==8)
			{
				for(int col = 1; col<=9; col++)
				{
					if(col==9)
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