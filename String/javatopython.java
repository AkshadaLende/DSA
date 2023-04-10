package string;

public class javatopython {
	public static void main(String[] args) {
		String s = "java is programming langauge java is high level programming langauge";
		String[] sc = s.split(" ");
		String target = "java";
		
		for (int i = 0; i < sc.length; i++) {

			if (sc[i].equals(target)) {
				
				sc[i] = "python";
				
			}
		}
	for (String string : sc) {
		System.out.print(string+" ");
	

		}

		
	}
}
