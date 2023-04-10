package array;

public class DuplicatesInAraay {
	public static void main(String[] args) {
		int a[]= {3,4,5,4,5,7,8};
		boolean [] b= new boolean[a.length];
		
		for (int i = 0; i < b.length; i++) {
			if(b[i]==false) {
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
						
					}
					
				}
				if(count==1) {
					System.out.print(a[i]+" ");
				}
				
			}

		}

		
	}

}
