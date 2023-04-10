package logical;

public class Decimaltooctal {
	public static void main(String[] args) {
		int num=12345;
		String dec="";
		while(num>0){
			int r =num%8;
			dec =r +dec;
			num=num/8;
		}
		System.out.println(dec);
	}

}
