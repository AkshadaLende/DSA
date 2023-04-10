package KunalKush;

public class Sqroot {
	public static void main(String[] args) {
		int x=16;
		float ans=sqroot(x);
		if(ans/(int) ans==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println(ans);
	}

	private static float sqroot(int x) {
		// TODO Auto-generated method stub
		  float start = 1;
	        float end = x;
	        float ans = 0;
	         
	        
	        
	        while (start <= end){
	            float mid = start + (end - start) / 2;
	            
	            // check can be do with mid * mid but have to make all the variable type to long
	            if (mid <= x / mid){
	                start = mid + 1;
	                ans = mid;
	            }else{
	                end = mid - 1;
	            }
	        }
	        
	        return ans;
	    }
	}


