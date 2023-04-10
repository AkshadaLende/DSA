//WAP to find sum of all digits if number is perfect sum
package logical;

public class sumpd {
	public static void main(String[] args) {
		int res=0;
				int num=28;
				int sum=0;
				for(int i=1;i<num;i++) {
					if(num%i==0) {
						sum=sum+i;
					}
				}
				if(num==sum) {
					while(num>0) {
						int d=num%10;
						res=res+d;
						num=num/10;
					}
				}
				System.out.println(res);
	}

}
