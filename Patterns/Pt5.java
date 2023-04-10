package patterns;

public class Pt5 {
	public static void main(String[] args) 
	{
		int N= 3;
		int n= 2*N;
		for (int i=0;i<=n ;i++ )
		{
			for (int j=0;j<=n ;j++)
			{
				int I= Math.min(Math.min(i,j),Math.min(n-i , n-j));
				if (I<1)
				{
					System.out.print("0 ");
				}
			else{
			System.out.print("  ");
			}
			}
            System.out.println();
		}
	}

}
