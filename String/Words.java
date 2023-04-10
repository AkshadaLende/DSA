package string;

public class Words {
	public static void main(String[] args) {
		String s = "java is a programming langauge it is used to  do programming java is a high level langauge";
		String a[] = s.split(" ");
		int duplicount=0;
		String dupliwords="";
		String x="";
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) 
			{
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i].equals(a[j]) ) {
						count++;
						b[j] = true;
					}
				}
				if(count>1) {
					duplicount++;
					dupliwords=dupliwords+a[i]+" ";
					x=x+ count +" ";
				//	System.out.println(duplicount);
					
				}
			}
		}
		System.out.println(" these are "+ duplicount + " duplicate words.");
		System.out.println("those words are "+ dupliwords +" and they have occured "+ x);
		
	}

}
