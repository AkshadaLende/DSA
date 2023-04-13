package Recurssion;

public class RemoveChar {
public static void main(String[] args) {
	String s="bccacad";
	String s1="";
	removechar(s,s1);
	removechar1(s);
	System.out.println(removechar1(s));
	String s3="absdappleasd";
	System.out.println(removechar2(s3));
}

private static void removechar(String s,String s1) {
	// TODO Auto-generated method stub
	if(s.isEmpty()) {
		System.out.println(s1);
		return;
	}
	char ch=s.charAt(0);
	if(ch=='a') {
		removechar(s.substring(1),s1);
	}else {
		removechar(s.substring(1),s1+ch);
	}
}

//return string
private static String removechar1(String s) {
	// TODO Auto-generated method stub
	if(s.isEmpty()) {
		//System.out.println(s1);
		return s;
	}
	char ch=s.charAt(0);
	if(ch=='a') {
	return	removechar1(s.substring(1));
	}else {
	return	ch + removechar1(s.substring(1));
	}
}
//skip word
private static String removechar2(String s) {
	// TODO Auto-generated method stub
	if(s.isEmpty()) {
		//System.out.println(s1);
		return s;
	}

	if(s.startsWith("apple")) {
	return	removechar2(s.substring(5));
	}else {
	return	s.charAt(0) + removechar2(s.substring(1));
	}
}

}
