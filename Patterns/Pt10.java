package patterns;

public class Pt10 {
	static void pat(int n)
	{
		n=n-1;
		for (int i=0;i<=2*n ;i++)

		{
			
			int totalcolinrow=i>n ? 2*n- i:i;
			
			int noofspaces= n-totalcolinrow;
			
			for (int s=0;s<noofspaces ; s++)
			{
				System.out.print(" ");
				
			}
			int ans=2*((n+1)-noofspaces)-2;
		for (int j=0;j<=ans;j++)
		{
			System.out.print("*");
			
		}
				System.out.println();
	
		}


	} 
  
  
  public static void main(String[] args) 
	{
	 pat(6);
	}

}
