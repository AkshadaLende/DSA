//seperate even digit number
package logical;

public class even {
	public static void main(String[] args) {
		int num = 23;
		 int an=0;
		  while(num>0)
			{
			  int rem= num%10;
				if(rem%2==0) {
					System.out.println(rem);
				}
			  
				num= num/10;

			}
	}

}
