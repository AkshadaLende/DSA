package logical;

public class Niven_harshad {
	public static void main(String[] args) {
		int num=24;
		int sum=0;
		int temp=num;
		while(num>0) {
			int d=num%10;
			sum=sum+d;
			num=num/10;
		}
		if(temp%sum==0) {
			System.out.println("NIven number");
		}else {
			System.out.println("not a niven number");
		}
	}

}
