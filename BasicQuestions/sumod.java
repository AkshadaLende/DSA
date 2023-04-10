package logical;

public class sumod {
	public static void main(String[] args) {
		int num=234;
		int prd=1;
		while(num>0)
		{
			int d=num%10;
			if(d%2!=0) {
				prd=prd*d;
			}
			num=num/10;
		}
		System.out.println(prd);
	}

}
