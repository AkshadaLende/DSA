package string;

import java.util.Scanner;

public class Hackerank_token {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "kjdhf dkfj,gk.";
        s=s.trim();
		String[] sc = s.split("[ !,?._'@]+");
		if(s.length()>0) {
	   
		int count = 0;
		for (int i = 0; i < sc.length; i++) {

			count++;
		}
		System.out.println(count);

		for (int i = 0; i < sc.length; i++) {

			System.out.print(sc[i] + "\n");

			count++;
		}
		}else {
			System.out.println("0");
		}
		scan.close();
	}
}
