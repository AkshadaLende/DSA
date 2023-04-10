package logical;

public class Decimaltobinary {
	public static void main(String[] args) {
		int num=12;
		String dec="";
		while(num>0){
			int r =num%2;// 0,1,1,1
			dec =r +dec;//"0","10","1110"
			num=num/2;//7,3,1
		}
		System.out.println(dec);
	}

}
