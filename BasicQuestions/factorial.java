package logical;

/*public class factorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		for(int i=1;i<=num;i++) {
			
          
          fact=fact*i;
          
          
	}
		System.out.println(fact);
	}

}*/

//WAP to find factorial of all the digits of a number
public class factorial {
	public static void main(String[] args) {
		int num = 534;
		
		while (num > 0) {
			int fact = 1;
			int d = num % 10;
			
			for (int i = d; i>0 ; i--) {

				fact = fact * i;

			}
			System.out.println(fact);
		
			num = num / 10;
		}
	
		
		
	}
}