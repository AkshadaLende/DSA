//WAP to find sum of all even digit of a number
package logical;

public class sumed {
	public static void main(String[] args) {
		int num=234;
		int sum=0;
		while(num>0)
		{
			int d=num%10;
			if(d%2==0) {
				sum=sum+d;
			}
			num=num/10;
		}
		System.out.println(sum);
	}

}
