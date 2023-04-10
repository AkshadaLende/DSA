package Leetcode;

public class DefanginganIPAddress {
public static void main(String[] args) {
	String 	address="1.1.1.1";
	String ans=defangIPaddr(address);
	System.out.println(ans);
}
public static String defangIPaddr(String address) {
	String s="";
	char ch[]=address.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='.') {
			s=s+"["+ch[i]+"]";
		}else {
			s=s+ch[i];
		}
	}
    return s;
}
}
