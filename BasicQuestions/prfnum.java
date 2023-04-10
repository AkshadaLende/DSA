package logical;

/*public class prfnum {
	public static void main(String[] args) {
		int num =6;
		int sum=0;
		for(int i=1 ; i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println("Perfect number");
		}else {
			System.out.println("kachda number");
		}
	}

}*/
//range
public class prfnum {
	public static void main(String[] args) {
		int num =100;
		
		for(int i=1 ; i<=num;i++) {
			
			int sum=0;
			for(int j=1 ; j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		
	}

}
