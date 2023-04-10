package Leetcode;

public class RepeatedSubstringPattern {
public static void main(String[] args) {
	String s="abab";
	boolean b=repeatedSubstringPattern(s);
	System.out.println(b);
	
}
public static boolean repeatedSubstringPattern(String s) {
    char ch[]=s.toCharArray();
    char ch1;
    char ch2;
    ch1=ch[0];
    ch2=ch[1];
    for(int i=0;i<ch.length;i++){
      
       if(!(ch[i]==ch1 && ch[i+1]==ch2)){
           return false;
       }
    }
    return true;
}
}
