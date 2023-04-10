package Hackerank;

import java.util.Scanner;

public class Solution1 {
	 public static void main(String[] args) {
	        int a, b;
	        try (Scanner scan = new Scanner(System.in)) {
	            a = scan.nextInt();
	            b = scan.nextInt();
	        }

	        Adder adderObject = new Adder();
	        System.out.println("The sum is: " + adderObject.add(a, b));
	    }
	    
	}

class Adder{
    
    static int add(int a,int b){
      int sum=0;
      sum=a+b;
      return sum;
  }
}

abstract class Calculator {
    abstract int add(int a, int b);
}