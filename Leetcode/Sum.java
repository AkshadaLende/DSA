package Leetcode;

public class Sum {
public static void main(String[] args) {
	int num []= {12};
	int i=0;
	int ds=digit(num[i]);
	System.out.println(ds);
}

private static int digit(int num) {
	// TODO Auto-generated method stub
	int sum=0;
	int d=0;
	while(num>0) {
		 d=num%10;
		sum=sum+d;
		num=num/10;
	}
	return sum;
}
}
