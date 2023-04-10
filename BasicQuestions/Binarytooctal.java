package logical;

public class Binarytooctal {
	
	public static void main(String[] args) {
		int num=1100;
		int n=bintodec(num);
		System.out.println(dectooct(n));
		
	}
	
		public static String dectooct(int num) {
			String dec="";
		
			while(num>0){
				int r =num%8;
				dec =r +dec;
				num=num/8;
			}
			return dec;
		}

		public static int bintodec(int num){

			
		   // int num = 1111;
		    int sum=0;
			int f = 0;
			while (num > 0) {
				int d = num % 10;
				sum = sum + d * power(2, f);
				num = num / 10;
				f++;
			}
			return sum;
		}

		public static int power(int n, int p) {

			int res = 1;
			for (int i = 1; i <= p; i++) {
				res = res * n;

			}
			return res;

		}

	}



