package patterns;

public class Pt4 {
public static void main(String[] args) 
	
	{
		int N= 3;
		int n= 2*N;
		for (int i=0; i<=n ; i++ )
		{
			for (int j=0; j<=n ; j++ )
			{
		    int I=N- Math.min(Math.min(i ,j),Math.min( n-i , n-j))+1;
			System.out.print(I+" ");
			}
            System.out.println();
		}
	}

}
