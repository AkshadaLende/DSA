package patterns;

public class Pt9 {
	public static void add( int g ) {
		for (int i =1; i <= g; i++)
		{
			
			for (int space = g ;space>i ;space-- )
			{
              System.out.print(" ");
              
			} 
			
			 for(int j= 1 ; j< i ; j++)
			 {
				
				 System.out.print("* ");
			 }
			 for (int space = g ; space>=i ;space-- )
			{
              System.out.print(" ");
			} 

		System.out.println();
		}
	}
	
public static void main(String[] args) 
	{
	add(4);
	
	}

}
