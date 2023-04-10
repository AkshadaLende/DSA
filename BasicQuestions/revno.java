//WAP to check if the number is palindrome number.
package logical;

public class revno {
	public static void main(String[] args) 
	{
      int num =121 ;
      int temp=num;
	  int ans=0;
	  while(num>0)
		{
			int rem= num%10;
           // System.out.print(rem);
			num= num/10;
			ans= ans*10 + rem;
		}
    //  System.out.print(ans);
      
      if(temp==ans) {
    	  System.out.println(" palindrome num");
      }else {
    	  System.out.println("not a palindrome");
      }
	}

}
