package Recurssion;

public class Rev {
	
	static	int sum=0;
public static void main(String[] args) {
	int n=5;
	int mul=1;
	int k=1234;
int i=3020004;
int count=0;
int num=14;
/*
 * funRev(n); factorial(n,mul); int ans=sumOfDigits(k); System.out.println(ans);
 * reverse(k); System.out.println(sum); System.out.println(reverse2(k));
 */
	
	System.out.println(count0(i,count));
System.out.println(numberOfSteps(num));	
	
}

private static int numberOfSteps(int num) {
	
	
	return helper2(num,0);
	
	
}

private static int helper2(int num, int steps) {
	// TODO Auto-generated method stub
	
	
     if(num==0){
         return steps;
     }
     if(num%2==0){
    	  steps++;
       return    helper2(num/2,steps); 
    
     }
         
       return    helper2( num-1,steps+1);
       
     
	
}

private static int count0(int i,int count) {
	// TODO Auto-generated method stub
	
	if(i==0) {
		return count;
		
	}
	
	int rem=i%10;
	if(rem==0) {
		count++;
	}
	return count0(i/10 ,count);
	
}

private static int  reverse2(int k) {
	// TODO Auto-generated method stub
	int digits=(int)(Math.log10(k))+1;
	return helper(k,digits);
}

private static int helper(int n, int digits) {
	// TODO Auto-generated method stub
	if(n%10==n) {
		return n;
	}
	int rem=n%10;
	
	return rem *(int)(Math.pow(10, digits-1)) + helper(n/10,digits-1);
}

private static void reverse(int k) {
	// TODO Auto-generated method stub
	
	if(k==0) {
		return ;
	}
	int rem =k%10;
	sum=sum*10 + rem;
	 reverse(k/10);
}

private static int sumOfDigits(int k) {
	// TODO Auto-generated method stub
	
	if(k%10==0) {
		return 1;
	}
	return k%10 * sumOfDigits(k/10);
}

private static void funRev(int n) {
	// TODO Auto-generated method stub
	if(n==0) {
		return;
	}
	funRev(n-1);
	System.out.println(n);
}

public static void factorial(int n,int mul){
	if(n==0) {
	System.out.println(mul);	
	return ;
	}
	mul=mul*n;
	factorial(n-1 ,mul);
	
}




}
