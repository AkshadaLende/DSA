package Leetcode;

public class HappyNumber {
public static void main(String[] args) {
	int n=2;
boolean b=	happyNumber(n);
System.out.println(b);
}

private static boolean happyNumber(int n) {
	// TODO Auto-generated method stub
	int sum=0;
	if (n==1) {
		return true;
	}
	if(n<10) {
		return false;
	}
	while(n>0) {
	int	d=n%10;
		sum =sum+ d*d;
		n=n/10;
	}
	
	
	return happyNumber(sum);
}
}
