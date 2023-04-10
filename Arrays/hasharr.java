package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*class Main{
	public static getkey()
}*/



public class hasharr {
	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
	    
	    h.put("f", "snehal");
	    h.put("j", "shruti");
	    h.put("a","akshada");
	   
	    
	    System.out.println("Map :"+ h.entrySet());
	    System.out.println(h.get("a"));
	  
	    		
        for ( Object o : h.keySet() ) {
            System.out.println("keyvalue " +o );
        }
	    
	    //used to convert map into set
	    System.out.println("Map to set"+ h.entrySet());
	    
	    
	    HashSet r= new HashSet(h.entrySet());
	    System.out.println("set :"+ r);   
	    
	    ArrayList a= new ArrayList(r);
	    System.out.println("set to list"+ a);
	}

	

	
	
	}	

// map to set
// set to list
