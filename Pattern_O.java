//OUTPUT
  * * * * * * *   
*               * 
*               * 
*               * 
*               * 
*               * 
*               * 
*               * 
  * * * * * * *   
//

public class Pattern_O {

	public static void main(String[] args) 
	{
		for(int row = 1; row<=9; row++)
		{
		if(row==1||row==9)
		{
			for(int col =1 ;col <=9; col++)
			{
				if(row == 1 && col==1 ||row == 1 && col==9 || row == 9 && col==1 ||row == 9 && col==9)
				{
					System.out.print("  ");
				}
				else
				{
				System.out.print("* ");
				}
			}
		}
		else
		{
			System.out.print("* " + "  "+ "  "+ "  "+ "  "+ "  "+ "  "+ "  "+ "* ");
		}
		System.out.println();
		}		
	}
}