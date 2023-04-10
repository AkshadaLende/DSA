package patterns;

public class Pt7 {
	public static void main(String[] args)
	{
    int n = 4;
    int N = 2 * n;
    for (int i = 1; i < N; i++) 
		{
        
        for (int j = 0; j < i; j++) 
			{
            System.out.print("*");
            for (int space = N; space >i; space--)
				{
                System.out.print(" ");
                for (int k = 0; k <i ; k++)
{
                    System.out.print("*");
                           }
						   System.out.print("\n");
            }
        }
    }
}

}
