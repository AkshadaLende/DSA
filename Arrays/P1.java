package array;

/*public class P1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int sum=0;
		//System.out.println(a);
		for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
		}
		System.out.println(sum);
		//for (int j : a) {
		//	System.out.println(j);
		//}
	}

}*/
//WAP to print all even elements of the array
public class P1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
	
		for (int i = 0; i < a.length; i++) {
		if(a[i]%2==0) {
		System.out.println(a[i]);	
		}
		}
		
	}

}