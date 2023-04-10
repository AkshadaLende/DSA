package string;

public class Methods {
public static void main(String[] args) {
	String s="Qspiders";
	System.out.println(s.indexOf('a'));
	System.out.println(s.startsWith("Qs"));
	System.out.println(s.endsWith("ers"));
	System.out.println(s.isEmpty());
	s=s.replace('s','x');
	System.out.println(s);
	s=s.replace("id", "ab");
	System.out.println(s);
	System.out.println(s.lastIndexOf('x'));
    System.out.println(s.toUpperCase());
    String b= 3+2+"aksh"+3+2;
    
    System.out.println(b);
    String S="akshaa";
    S="jhfdjhf";
    System.out.println(S);
    
}
}
