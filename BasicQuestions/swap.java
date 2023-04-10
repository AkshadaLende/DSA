package logical;

/*public class swap {
	public static void main(String[] args) {
		int a=4;
		int b=5;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}

}*/
//wap to swap to varibales without using third variable
public class swap {
	public static void main(String[] args) {
		int a=4;
		int b=5;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}

}

