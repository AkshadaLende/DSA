package string;

public class StringBuildermethods {
	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("jva");
		s.insert(1, 'a');
		System.out.println(s);
		s.append("Programming");
		System.out.println(s);
		s.replace(0,4,"python");
		System.out.println(s);
		s.delete(0, 6);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}

}
