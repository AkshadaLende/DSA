package logical;

/*public class spclnum {
	public static void main(String[] args) {
		int num=12;
		int sum=0;
		int prd=1;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			prd=prd*rem;
			num=num/10;
			
		}
		int res=sum+prd;
		if (num==res) {
			System.out.println("special number");
		}else {
			System.out.println("not a special number");
		}
	}

}*/

//range 1-100

public class spclnum {
	public static void main(String[] args) {
		
		
		for(int i=1 ;i<=100;i++) {
			int num=i;
			int sum=0;
			int prd=1;
			int temp=num;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			prd=prd*rem;
			num=num/10;
		}	
		
		int res=sum+prd;
		if (temp==res) {
			System.out.println(i);
		}
	}

}
}