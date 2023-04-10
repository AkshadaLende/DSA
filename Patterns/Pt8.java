package patterns;

public class Pt8 {
	public static void main(String[]args)

	{
	   int a =65;
	   for( int row =0 ; row<= 4 ; row++)
		{
			for (int col = 0 ; col<=row  ;col++ )
			{
				char A = ((char )(a+row));
				System.out.print(A);
			}
		 System.out.println("\n");
		}

    }

}
