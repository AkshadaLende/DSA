package logical;

public class Strongn {
	public static void main(String[] args) {
		
	
	int num=145;
	int sum=0;
	int temp=num;
	
	while(num>0) {
		int res=num%10;
		sum=sum+factorial(res);
		num=num/10;
	}
	if(temp==sum){
	System.out.println("strong num");
	}else{
	System.out.println("weak num");
	}
	}
	 
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
					
		}
		return fact;
	}
	
}
