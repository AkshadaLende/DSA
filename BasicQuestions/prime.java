package logical;

public class prime {
	
	public static void main(String[] args) {
		int num =100;
		
		for(int i=1 ; i<=num;i++) {
			
			int sum=0;
			for(int j=1 ; j<i;j++) {
				if(i%j==0) {
					sum=sum+i;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		
	}


}

//break-outside block
//continue- outside condtion
//return- method
/*public class prime{
	public static void main(String[] args) {
		int num = 18;

		if (num <= 1) {
			System.out.println("not prime num");
			return;
		}
		
		for(int n= 2; n<num ;n++)
		{
			if (num % n == 0) {
				System.out.println("not a prime no.");
                 return;
			}
		}
	System.out.println("prime number");
	}	
}*/
