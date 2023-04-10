package patterns;

public class Pt3 {
	public static void main(String[] args) 
	{
		int N= 3;
		int n= 2*N;
		for (int i=0;i<=n ;i++ )
		{
			for (int j=0;j<=n ;j++)
			{
				int I= Math.min(Math.min(i,j),Math.min(n-i , n-j));
			System.out.print(I+" ");
			}
            System.out.println();
		}
	}

}
