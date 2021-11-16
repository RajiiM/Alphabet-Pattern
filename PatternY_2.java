//OUTPUT
*               * 
  *           * 
    *       * 
      *   * 
        * 
      * 
    * 
  * 
* 
//

public class PatternY_2 {

	public static void main(String[] args) 
	{
		for(int row = 9; row>=1; row--)
		{
			for(int col = 1; col<= row; col++)
			{
				if (col == row || col == 10-row)
				{
					System.out.print("* ");	
				}
				else
				{
				System.out.print("  ");
				}				
			}
			System.out.println();
		}		
	}
}